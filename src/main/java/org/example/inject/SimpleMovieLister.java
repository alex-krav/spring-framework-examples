package org.example.inject;

import org.springframework.stereotype.Component;

import javax.annotation.ManagedBean;
import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;
import java.util.Optional;

//@Component
@ManagedBean
public class SimpleMovieLister {

    private MovieFinder movieFinder;
//    private Optional<MovieFinder> movieFinder;
//    private Provider<MovieFinder> movieFinder;

    @Inject
    public void setMovieFinder(@Nullable MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

//    @Inject
//    public void setMovieFinder(Provider<MovieFinder> movieFinder) {
//        this.movieFinder = movieFinder;
//    }

//    @Inject
//    public void setMovieFinder(@Named("main") MovieFinder movieFinder) {
//        this.movieFinder = movieFinder;
//    }

//    @Inject
//    public void setMovieFinder(Optional<MovieFinder> movieFinder) {
//        this.movieFinder = movieFinder;
//    }

    @Override
    public String toString() {
        return super.toString() + " + " + movieFinder;
    }
}