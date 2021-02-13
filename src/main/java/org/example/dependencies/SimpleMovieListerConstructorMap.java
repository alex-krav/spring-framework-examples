package org.example.dependencies;

import java.util.Map;

public class SimpleMovieListerConstructorMap {

    private Map<String,MovieFinder> movieFinders;

    public SimpleMovieListerConstructorMap(Map<String,MovieFinder> movieFinders) {
        this.movieFinders = movieFinders;
    }

    @Override
    public String toString() {
        return "[ListerConstructor with Finders: " + movieFinders + "]";
    }
}
