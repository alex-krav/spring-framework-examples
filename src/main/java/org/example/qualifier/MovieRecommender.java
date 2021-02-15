package org.example.qualifier;

import org.springframework.beans.factory.annotation.Autowired;

public class MovieRecommender {

    @Autowired
    @Genre("Action")
    private MovieCatalog actionCatalog;

    private MovieCatalog comedyCatalog;

    @Autowired
    public void setComedyCatalog(@Genre("Comedy") MovieCatalog comedyCatalog) {
        this.comedyCatalog = comedyCatalog;
    }

    @Autowired
    @Offline
    private MovieCatalog offlineCatalog;

    @Autowired
    @MovieQualifier(format=Format.VHS, genre="Action")
    private MovieCatalog actionVhsCatalog;

    @Override
    public String toString() {
        return super.toString() +
                "\n + " + actionCatalog +
                "\n + " + comedyCatalog +
                "\n + " + offlineCatalog +
                "\n + " + actionVhsCatalog;
    }
}
