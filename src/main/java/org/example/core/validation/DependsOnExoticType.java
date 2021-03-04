package org.example.core.validation;

public class DependsOnExoticType {

    private ExoticType type;

    public void setType(ExoticType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Dependent: " + type;
    }
}