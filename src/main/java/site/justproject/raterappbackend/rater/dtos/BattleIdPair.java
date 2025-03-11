package site.justproject.raterappbackend.rater.dtos;

public record BattleIdPair(int id1, int id2) {

    public BattleIdPair {

        if(id1 == id2){
            throw  new RuntimeException("Id's must be different");
        }

        if(id1 < 1 || id1>162 || id2 < 1 || id2 > 162){
            throw new RuntimeException("Wrong id!");
        }

    }
}
