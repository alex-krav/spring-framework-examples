package org.example.core.ioc.inject;

import javax.annotation.ManagedBean;
import javax.annotation.Nullable;
import javax.inject.Inject;

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