package org.example.components;

import org.springframework.stereotype.Service;

@Service
public class SimpleMovieLister {

    private MovieFinder movieFinder;

    public SimpleMovieLister(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

    @Override
    public String toString() {
        return super.toString() + " + " + movieFinder;
    }
}
