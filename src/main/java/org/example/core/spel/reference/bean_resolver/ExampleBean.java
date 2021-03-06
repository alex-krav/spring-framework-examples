package org.example.core.spel.reference.bean_resolver;

import org.springframework.beans.factory.annotation.Value;

public class ExampleBean {
    @Value("#{systemProperties['user.region'] ?: 'Ukraine'}")
    public String region;
}
