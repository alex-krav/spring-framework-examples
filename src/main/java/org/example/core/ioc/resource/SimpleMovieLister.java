package org.example.core.ioc.resource;

import org.springframework.context.ApplicationContext;

import javax.annotation.Resource;

public class SimpleMovieLister {

    private MovieFinder movieFinder;

    @Resource
    private ApplicationContext context;

    @Resource //(name="myMovieFinder")
    public void setMovieFinder(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

    @Override
    public String toString() {
        return super.toString() + " + " + movieFinder + " + " + context;
    }
}