package org.example;

import java.util.List;

public class CalculadoraEstadisticas {

    public int calcularSuma(List<Integer> numeros) {
        int suma = 0;

        for (int numero : numeros) {
            suma += numero;
        }

        return suma;
    }

    public double calcularPromedio(List<Integer> numeros) {
        if (numeros.isEmpty()) {
            throw new IllegalArgumentException("La lista no puede estar vacía");
        }

        return (double) calcularSuma(numeros) / numeros.size();
    }

    public int encontrarMaximo(List<Integer> numeros) {
        if (numeros.isEmpty()) {
            throw new IllegalArgumentException("La lista no puede estar vacía");
        }

        int maximo = numeros.get(0);

        for (int numero : numeros) {
            if (numero > maximo) {
                maximo = numero;
            }
        }

        return maximo;
    }
}