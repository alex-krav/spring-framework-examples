package org.example.core.validation;

public class ExoticType {

    private String name;

    public ExoticType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Exotic: " + name;
    }
}