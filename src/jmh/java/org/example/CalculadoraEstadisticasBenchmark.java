package org.example;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

@BenchmarkMode(org.openjdk.jmh.annotations.Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@State(Scope.Benchmark)
public class CalculadoraEstadisticasBenchmark {

    //@Param({"1000", "10000", "100000", "1000000"})
    @Param({"10", "100", "1000"})
    private int tamano;

    private CalculadoraEstadisticas calculadora;
    private List<Integer> numeros;

    @Setup(Level.Trial)
    public void prepararDatos() {
        calculadora = new CalculadoraEstadisticas();

        numeros = IntStream.range(0, tamano)
                .boxed()
                .toList();
    }

    @Benchmark
    public int medirCalcularSuma() {
        return calculadora.calcularSuma(numeros);
    }
}