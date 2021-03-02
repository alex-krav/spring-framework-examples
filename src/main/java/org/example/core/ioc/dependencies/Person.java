package org.example.core.ioc.dependencies;

public class Person {
    private String name;
    private Person spouse;

    public void setName(String name) {
        this.name = name;
    }

    public void setSpouse(Person spouse) {
        this.spouse = spouse;
    }
}
