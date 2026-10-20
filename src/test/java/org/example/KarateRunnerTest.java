package org.example;

import com.intuit.karate.junit5.Karate;

class KarateRunnerTest {

    @Karate.Test
    Karate probarCalculadora() {
        return Karate.run("classpath:karate/calculadora.feature");
    }
}