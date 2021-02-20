package org.example.proxy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration
//@ComponentScan("org.example.proxy")
public class MyConfig {

//    @Bean
    public MyBean configBean() {
        return new MyBean("config");
    }
}
