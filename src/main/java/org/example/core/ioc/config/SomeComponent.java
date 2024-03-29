package org.example.core.ioc.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SomeComponent {

    @Autowired
    private AnotherService anotherService;

    @Override
    public String toString() {
        return super.toString() + " + " + anotherService;
    }
}
