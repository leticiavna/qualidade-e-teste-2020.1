package uff.qet.common.classes;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class ClassModelTest {

    @Test
    void testGetId() {
        assertNotNull(ClassModel.getId());
        assertEquals(UUID.class, ClassModel.getId().getClass());
    }

    @Test
    void testGetCreatedAt() {
        assertNotNull(ClassModel.getCreatedAt());
        assertEquals(LocalDateTime.class, ClassModel.getCreatedAt().getClass());
    }
}