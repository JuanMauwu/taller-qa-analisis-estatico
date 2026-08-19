package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculadoraEstadisticasTest {

    @Test
    void calcularSuma_deberiaRetornarLaSumaCorrecta() {

        // Arrange
        CalculadoraEstadisticas calculadora = new CalculadoraEstadisticas();
        List<Integer> numeros = List.of(2, 4, 6, 8);

        // Act
        int resultado = calculadora.calcularSuma(numeros);

        // Assert
        assertEquals(20, resultado);
    }

    @Test
    void calcularPromedio_deberiaRetornarElPromedioCorrecto() {

        // Arrange
        CalculadoraEstadisticas calculadora = new CalculadoraEstadisticas();
        List<Integer> numeros = List.of(2, 4, 6, 8);

        // Act
        double resultado = calculadora.calcularPromedio(numeros);

        // Assert
        assertEquals(5.0, resultado);
    }

    @Test
    void encontrarMaximo_deberiaRetornarElNumeroMayor() {

        // Arrange
        CalculadoraEstadisticas calculadora = new CalculadoraEstadisticas();
        List<Integer> numeros = List.of(2, 4, 6, 8);

        // Act
        int resultado = calculadora.encontrarMaximo(numeros);

        // Assert
        assertEquals(8, resultado);
    }

    @Test
    void calcularPromedio_conListaVacia_deberiaLanzarExcepcion() {

        // Arrange
        CalculadoraEstadisticas calculadora = new CalculadoraEstadisticas();
        List<Integer> numeros = List.of();

        // Act & Assert
        assertThrows(
                IllegalArgumentException.class,
                () -> calculadora.calcularPromedio(numeros)
        );
    }
}