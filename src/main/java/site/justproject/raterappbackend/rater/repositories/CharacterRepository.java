package site.justproject.raterappbackend.rater.repositories;


import org.springframework.stereotype.Repository;
import site.justproject.raterappbackend.rater.entities.CharacterEntity;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class CharacterRepository {


    private final Map<Integer,CharacterEntity > fakeDB = new ConcurrentHashMap<>();


    public Optional<CharacterEntity> findById(int id) {

        return Optional.ofNullable(fakeDB.get(id));
    }


    public List<CharacterEntity> getAllSortedByLeaderboad() {

        return fakeDB.values().stream()
                .sorted(Comparator.comparingInt(c -> c.getRating()))
                .toList().reversed();
    }
}
