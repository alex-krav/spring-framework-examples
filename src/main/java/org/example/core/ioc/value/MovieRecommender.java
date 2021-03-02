package org.example.core.ioc.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class MovieRecommender {

    @Value("#{systemProperties['user.catalog'] + 'Catalog' }")
    private /*final*/ String catalog;

    @Value("${num}")
    private int number;

    @Value("${names}")
    private String[] names;

    /*public MovieRecommender(@Value("${catalog.name}") String catalog) {
        this.catalog = catalog;
    }*/

    @Override
    public String toString() {
        return super.toString() + ", catalog: " + catalog + ", number: " + number + ", names: " + Arrays.toString(names);
    }
}
