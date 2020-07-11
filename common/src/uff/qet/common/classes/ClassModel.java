package uff.qet.common.classes;

import java.time.LocalDateTime;
import java.util.UUID;

public abstract class ClassModel {
    private static final UUID id = UUID.randomUUID();
    private static final LocalDateTime createdAt = LocalDateTime.now();

    public static UUID getId() {
        return id;
    }

    public static LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
