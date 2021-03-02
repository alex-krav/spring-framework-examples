package org.example.core.ioc.config.mixed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {

    @Autowired
    private Company company;

    @Override
    public String toString() {
        return super.toString() + ", " + company;
    }
}
