package org.example;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

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

    public int encontrarMinimo(List<Integer> numeros) {
        if (numeros.isEmpty()) {
            throw new IllegalArgumentException("La lista no puede estar vacía");
        }

        int minimo = numeros.get(0);

        for (int numero : numeros) {
            if (numero < minimo) {
                minimo = numero;
            }
        }

        return minimo;
    }

    public double calcularMediana(List<Integer> numeros) {
        if (numeros.isEmpty()) {
            throw new IllegalArgumentException("La lista no puede estar vacía");
        }

        List<Integer> ordenados = new ArrayList<>(numeros);
        Collections.sort(ordenados);

        int medio = ordenados.size() / 2;

        if (ordenados.size() % 2 == 0) {
            return (ordenados.get(medio - 1) + ordenados.get(medio)) / 2.0;
        }

        return ordenados.get(medio);
    }

}