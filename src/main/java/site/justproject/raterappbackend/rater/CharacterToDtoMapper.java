package site.justproject.raterappbackend.rater;

import org.springframework.stereotype.Service;
import site.justproject.raterappbackend.rater.entities.CharacterEntity;

import java.util.function.Function;

@Service
public class CharacterToDtoMapper implements Function<CharacterEntity,CharacterResponse> {


    @Override
    public CharacterResponse apply(CharacterEntity c) {
        return new CharacterResponse(c.getName(),c.getRating());
    }
}
