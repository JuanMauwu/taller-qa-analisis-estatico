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

    @Test
    void encontrarMaximo_conListaVacia_deberiaLanzarExcepcion() {

        // Arrange
        CalculadoraEstadisticas calculadora = new CalculadoraEstadisticas();
        List<Integer> numeros = List.of();

        // Act & Assert
        assertThrows(
                IllegalArgumentException.class,
                () -> calculadora.encontrarMaximo(numeros)
        );
    }

    @Test
    void encontrarMinimo_deberiaRetornarElNumeroMenor() {

        // Arrange
        CalculadoraEstadisticas calculadora = new CalculadoraEstadisticas();
        List<Integer> numeros = List.of(5, 2, 9, 1);

        // Act
        int resultado = calculadora.encontrarMinimo(numeros);

        // Assert
        assertEquals(1, resultado);
    }

    @Test
    void encontrarMinimo_conListaVacia_deberiaLanzarExcepcion() {

        // Arrange
        CalculadoraEstadisticas calculadora = new CalculadoraEstadisticas();
        List<Integer> numeros = List.of();

        // Act & Assert
        assertThrows(
                IllegalArgumentException.class,
                () -> calculadora.encontrarMinimo(numeros)
        );
    }

    @Test
    void calcularMediana_conCantidadImpar_deberiaRetornarElDelMedio() {

        // Arrange
        CalculadoraEstadisticas calculadora = new CalculadoraEstadisticas();
        List<Integer> numeros = List.of(7, 1, 5);

        // Act
        double resultado = calculadora.calcularMediana(numeros);

        // Assert
        assertEquals(5.0, resultado);
    }

    @Test
    void calcularMediana_conCantidadPar_deberiaRetornarPromedioDeLosDosDelMedio() {

        // Arrange
        CalculadoraEstadisticas calculadora = new CalculadoraEstadisticas();
        List<Integer> numeros = List.of(4, 1, 3, 2);

        // Act
        double resultado = calculadora.calcularMediana(numeros);

        // Assert
        assertEquals(2.5, resultado);
    }

    @Test
    void calcularMediana_conListaVacia_deberiaLanzarExcepcion() {

        // Arrange
        CalculadoraEstadisticas calculadora = new CalculadoraEstadisticas();
        List<Integer> numeros = List.of();

        // Act & Assert
        assertThrows(
                IllegalArgumentException.class,
                () -> calculadora.calcularMediana(numeros)
        );
    }
}