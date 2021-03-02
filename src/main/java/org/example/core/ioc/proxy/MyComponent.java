package org.example.core.ioc.proxy;

//@Component
public class MyComponent {

//    @Bean
    public MyBean componentBean() {
        return new MyBean("component");
    }
}
