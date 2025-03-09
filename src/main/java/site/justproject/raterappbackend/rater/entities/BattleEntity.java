package site.justproject.raterappbackend.rater.entities;

import java.time.LocalDateTime;
import java.util.UUID;


public class BattleEntity {

    private UUID id;
    private int firstId;
    private int secondId;
    private LocalDateTime creationTime;

    public BattleEntity(UUID id, int firstId, int secondId, LocalDateTime creationTime) {
        this.id = id;
        this.firstId = firstId;
        this.secondId = secondId;
        this.creationTime = creationTime;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setFirstId(int firstId) {
        this.firstId = firstId;
    }

    public void setSecondId(int secondId) {
        this.secondId = secondId;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public UUID getId() {
        return id;
    }

    public int getFirstId() {
        return firstId;
    }

    public int getSecondId() {
        return secondId;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }
}
