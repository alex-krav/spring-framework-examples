package org.example.core.spel.reference.bean_resolver;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan
public class AppConfig {
    @Bean
    public ExampleBean exampleBean() {
        return new ExampleBean();
    }
}
