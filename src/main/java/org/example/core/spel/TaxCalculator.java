package org.example.core.spel;

import java.util.Locale;

public class TaxCalculator {
    private Locale defaultLocale;

    public void setDefaultLocale(Locale defaultLocale) {
        this.defaultLocale = defaultLocale;
    }

    @Override
    public String toString() {
        return "locale: " + defaultLocale;
    }
}
