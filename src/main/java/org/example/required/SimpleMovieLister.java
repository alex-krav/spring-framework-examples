package org.example.required;

import org.example.dependencies.MovieFinder;
import org.springframework.beans.factory.annotation.Required;

public class SimpleMovieLister {

    private MovieFinder movieFinder;

    @Required
    public void setMovieFinder(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

    @Override
    public String toString() {
        return super.toString() + " + " + movieFinder;
    }
}
