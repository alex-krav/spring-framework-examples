package org.example.core.ioc.required;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;

public class MovieRecommender {

//    private MovieCatalog[] movieCatalogs;
//    @Autowired(required = false)
//    private Map<String,MovieCatalog> movieCatalogs;

//    private /*final*/ CustomerPreferenceDao customerPreferenceDao;
//    @Autowired(required = false)
//    private /*final*/ MovieCatalog movieCatalog;

//    @Autowired
//    public MovieRecommender(CustomerPreferenceDao customerPreferenceDao) {
//        this.customerPreferenceDao = customerPreferenceDao;
//    }

//    @Autowired
//    public void setCustomerPreferenceDao(CustomerPreferenceDao customerPreferenceDao) {
//        this.customerPreferenceDao = customerPreferenceDao;
//    }

    /*@Autowired
    public void prepare(CustomerPreferenceDao customerPreferenceDao, MovieCatalog movieCatalog) {
        this.customerPreferenceDao = customerPreferenceDao;
        this.movieCatalog = movieCatalog;
    }*/

//    private /*final*/ Optional<MovieCatalog> movieCatalog;
    private /*final*/ MovieCatalog movieCatalog;

//    @Autowired
//    public void setMovieCatalog(Optional<MovieCatalog> movieCatalog) {
//        this.movieCatalog = movieCatalog;
//    }

    @Autowired
    public void setMovieCatalog(@Nullable MovieCatalog movieCatalog) {
        this.movieCatalog = movieCatalog;
    }

//    public MovieRecommender(@Autowired MovieCatalog movieCatalog) {
//        this.movieCatalog = movieCatalog;
//    }

    @Override
    public String toString() {
//        return super.toString() + " + " + customerPreferenceDao + " + " + movieCatalog;
        return super.toString() + " + " + movieCatalog;
    }
}
