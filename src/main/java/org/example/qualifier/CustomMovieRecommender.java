package org.example.qualifier;

import org.springframework.beans.factory.annotation.Autowired;

public class CustomMovieRecommender {

    @Autowired
    @CustomQualifier
    private MovieCatalog catalog;

    @Override
    public String toString() {
        return super.toString() +
                "\n + " + catalog;
    }
}
