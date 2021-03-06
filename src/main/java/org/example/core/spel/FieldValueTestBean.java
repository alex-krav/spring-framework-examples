package org.example.core.spel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class FieldValueTestBean {

    @Value("#{ systemProperties['user.region'] }")
    private String defaultLocale;

    public FieldValueTestBean(@Value("#{ systemProperties['user.region'] }")
                                      String defaultLocale) {
        this.defaultLocale = defaultLocale;
    }

    @Autowired
    public void configure(@Value("#{ systemProperties['user.region'] }")
                                      String defaultLocale) {
        this.defaultLocale = defaultLocale;
    }

    @Value("#{ systemProperties['user.region'] }")
    public void setDefaultLocale(String defaultLocale) {
        this.defaultLocale = defaultLocale;
    }

    public String getDefaultLocale() {
        return this.defaultLocale;
    }
}
