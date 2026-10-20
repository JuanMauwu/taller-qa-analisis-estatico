package org.example;

import java.util.logging.Logger;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        LOGGER.info("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            LOGGER.info("i = " + i);
        }
    }
}