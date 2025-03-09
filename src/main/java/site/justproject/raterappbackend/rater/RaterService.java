package site.justproject.raterappbackend.rater;


import org.springframework.stereotype.Service;
import site.justproject.raterappbackend.rater.dtos.BattleIdPair;
import site.justproject.raterappbackend.rater.dtos.BattleResponse;
import site.justproject.raterappbackend.rater.entities.BattleEntity;
import site.justproject.raterappbackend.rater.entities.RandomIdGenerator;
import site.justproject.raterappbackend.rater.repositories.BattleRepository;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

@Service

public class RaterService {


    private final RandomIdGenerator randomIdPairGenerator;
    private final BattleRepository battleRepository;

    public RaterService(RandomIdGenerator randomIdPairGenerator, BattleRepository battleRepository) {
        this.randomIdPairGenerator = randomIdPairGenerator;
        this.battleRepository = battleRepository;
    }

    public BattleResponse generateBattle() {

        UUID uuid = UUID.randomUUID();
        BattleIdPair battlePair = randomIdPairGenerator.generate();

        battleRepository.save(new BattleEntity(uuid,battlePair.id1(),battlePair.id2(), LocalDateTime.now()));

        return new BattleResponse(uuid.toString(),battlePair.id1(),battlePair.id2());
    }


    public void processWinner(UUID id, int winnerId) {

        Optional<BattleEntity> battleById = battleRepository.findById(id);

        if(battleById.isEmpty()){
            throw new RuntimeException("Battle does not exist.");
        }

        BattleEntity battle = battleById.get();

        if(battle.getFirstId() != winnerId && battle.getSecondId() != winnerId){
            throw new RuntimeException("Not this time :)");
        }

        //zmiana rankingu

        battleRepository.deleteById(id);

    }
}
