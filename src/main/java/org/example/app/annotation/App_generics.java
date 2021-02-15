package org.example.app.annotation;

import org.example.generics.Service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App_generics {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("org.example.generics");
        Service service = context.getBean(Service.class);
        System.out.println(service);
    }
}
