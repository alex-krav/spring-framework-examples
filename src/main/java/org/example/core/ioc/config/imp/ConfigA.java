package org.example.core.ioc.config.imp;

import org.example.core.ioc.config.MyServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigA {

    @Bean
    public MyServiceImpl myService() {
        return new MyServiceImpl();
    }
}
