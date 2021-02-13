package org.example.dependencies;

public class SimpleMovieListerSetter {

    private MovieFinder movieFinder;

    public void setMovieFinder(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

    @Override
    public String toString() {
        return "[ListerSetter with Finder " + movieFinder + "]";
    }
}
