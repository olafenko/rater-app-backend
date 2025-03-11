package site.justproject.raterappbackend.rater.dtos;

import java.util.UUID;

public record AnswerRequest(UUID battleId, int winnerId) {
}
