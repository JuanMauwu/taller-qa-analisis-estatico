Feature: Calculadora de estadísticas

  Background:
    * def Calculadora = Java.type('org.example.CalculadoraEstadisticas')
    * def calc = new Calculadora()

  Scenario: La suma de una lista de números es correcta
    * def resultado = calc.calcularSuma([2, 4, 6, 8])
    * match resultado == 20

  Scenario: El promedio de una lista de números es correcto
    * def resultado = calc.calcularPromedio([2, 4, 6, 8])
    * match resultado == 5.0

  Scenario: El máximo de una lista de números es correcto
    * def resultado = calc.encontrarMaximo([3, 9, 1])
    * match resultado == 9

  Scenario: El mínimo de una lista de números es correcto
    * def resultado = calc.encontrarMinimo([5, 2, 9, 1])
    * match resultado == 1

  Scenario: La mediana de una cantidad par de números es correcta
    * def resultado = calc.calcularMediana([4, 1, 3, 2])
    * match resultado == 2.5