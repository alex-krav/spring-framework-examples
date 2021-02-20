package org.example.proxy;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

//@Component
public class MyComponent {

//    @Bean
    public MyBean componentBean() {
        return new MyBean("component");
    }
}
