package site.justproject.raterappbackend.rater;


import org.springframework.stereotype.Service;
import site.justproject.raterappbackend.rater.dtos.BattleIdPair;
import site.justproject.raterappbackend.rater.dtos.BattleResponse;
import site.justproject.raterappbackend.rater.entities.BattleEntity;
import site.justproject.raterappbackend.rater.entities.CharacterEntity;
import site.justproject.raterappbackend.rater.entities.RandomIdGenerator;
import site.justproject.raterappbackend.rater.repositories.BattleRepository;
import site.justproject.raterappbackend.rater.repositories.CharacterRepository;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

@Service
public class RaterService {

    private final RandomIdGenerator randomIdPairGenerator;
    private final BattleRepository battleRepository;
    private final CharacterRepository characterRepository;
    private final RatingCalculator ratingCalculator = new RatingCalculator();

    public RaterService(RandomIdGenerator randomIdPairGenerator, BattleRepository battleRepository, CharacterRepository characterRepository) {
        this.randomIdPairGenerator = randomIdPairGenerator;
        this.battleRepository = battleRepository;
        this.characterRepository = characterRepository;
    }

    public BattleResponse generateBattle() {

        UUID uuid = UUID.randomUUID();
        BattleIdPair battlePair = randomIdPairGenerator.generate();

        battleRepository.save(new BattleEntity(uuid,battlePair.id1(),battlePair.id2(), LocalDateTime.now()));

        return new BattleResponse(uuid.toString(),battlePair.id1(),battlePair.id2());
    }


    public void processWinner(UUID battleId, int winnerId) {

        Optional<BattleEntity> optionalOfBattle = battleRepository.findById(battleId);

        if(optionalOfBattle.isEmpty()){
            throw new RuntimeException("Battle does not exist.");
        }

        BattleEntity battle = optionalOfBattle.get();

        if(battle.getFirstId() != winnerId && battle.getSecondId() != winnerId){
            throw new RuntimeException("Not this time :)");
        }

        //zmiana rankingu

        Optional<CharacterEntity> firstOptional = characterRepository.findById(battle.getFirstId());
        Optional<CharacterEntity> secondOptional = characterRepository.findById(battle.getSecondId());

        if(firstOptional.isEmpty() || secondOptional.isEmpty()){
            throw new RuntimeException("one of id's is invalid");
        }

        CharacterEntity first = firstOptional.get();
        CharacterEntity second = secondOptional.get();

        RatingPair ratingPair;

        if(winnerId == first.getId()){
            ratingPair = ratingCalculator.calculateRatings(first.getRating(),second.getRating());
            first.setRating(ratingPair.winnerRating());
            second.setRating(ratingPair.loserRating());
        } else {
            ratingPair = ratingCalculator.calculateRatings(second.getRating(),first.getRating());
        }






        battleRepository.deleteById(battleId);

    }
}
