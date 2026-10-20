package org.example;

import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void main_deberiaEjecutarseSinErrores() {
        // Act & Assert
        org.junit.jupiter.api.Assertions.assertDoesNotThrow(() -> Main.main(new String[]{}));
    }
}