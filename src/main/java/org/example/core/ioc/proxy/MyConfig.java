package org.example.core.ioc.proxy;

//@Configuration
//@ComponentScan("org.example.core.ioc.proxy")
public class MyConfig {

//    @Bean
    public MyBean configBean() {
        return new MyBean("config");
    }
}
