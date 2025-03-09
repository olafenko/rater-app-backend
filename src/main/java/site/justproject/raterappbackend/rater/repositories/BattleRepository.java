package site.justproject.raterappbackend.rater.repositories;


import org.springframework.stereotype.Repository;
import site.justproject.raterappbackend.rater.entities.BattleEntity;

import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class BattleRepository {


    private final Map<UUID, BattleEntity> fakeDB = new ConcurrentHashMap<>();


    public void save(BattleEntity battleEntity) {
        fakeDB.put(battleEntity.getId(),battleEntity);
    }

    public Optional<BattleEntity> findById(UUID id){
        return Optional.ofNullable(fakeDB.get(id));
    }

    public void deleteById(UUID id) {
        fakeDB.remove(id);
    }
}
