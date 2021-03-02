package org.example.core.ioc.java;

import java.util.Optional;

public class TestOptional {
    public static void main(String[] args) {
        Optional<String> optionalString = Optional.empty();
        System.out.println(optionalString);

        optionalString = Optional.of("lalala");
        System.out.println(optionalString);
    }
}
