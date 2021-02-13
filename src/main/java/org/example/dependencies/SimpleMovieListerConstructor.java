package org.example.dependencies;

public class SimpleMovieListerConstructor {

    private MovieFinder movieFinder;

    public SimpleMovieListerConstructor(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

    @Override
    public String toString() {
        return "[ListerConstructor with Finder " + movieFinder + "]";
    }
}
