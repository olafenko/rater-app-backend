package site.justproject.raterappbackend.rater;


import org.springframework.stereotype.Service;
import site.justproject.raterappbackend.rater.dtos.BattleIdPair;

import java.util.Random;

@Service
class RandomIdGenerator {

    private final static Random random = new Random();

    public BattleIdPair generate() {

        int id1 = random.nextInt(162) + 1; // 1-44
        int id2 = generateIdWithExcept(id1); // 1-44 without id1

        return new BattleIdPair(id1,id2);
    }

    public int generateIdWithExcept(int except){

        int id = random.nextInt(162) + 1;

        if (id != except){
            return id;
        }
        return generateIdWithExcept(except);
    }

}
