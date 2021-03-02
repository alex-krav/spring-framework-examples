package org.example.core.ioc.components.filter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SimpleMovieLister {

    @Autowired
    private MovieFinder movieFinder;

//    public SimpleMovieLister(MovieFinder movieFinder) {
//        this.movieFinder = movieFinder;
//    }

    @Override
    public String toString() {
        return super.toString() + " + " + movieFinder;
    }
}
