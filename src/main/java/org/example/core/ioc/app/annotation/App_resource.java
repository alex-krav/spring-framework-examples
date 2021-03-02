package org.example.core.ioc.app.annotation;

import org.example.core.ioc.resource.SimpleMovieLister;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App_resource {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("core/ioc/annotation/resource.xml");
        SimpleMovieLister lister = context.getBean("lister", SimpleMovieLister.class);
        System.out.println(lister);
    }
}
