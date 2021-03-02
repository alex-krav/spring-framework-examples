package org.example.core.ioc.app.annotation;

import org.example.core.ioc.value.MovieRecommender;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App_value {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("org.example.core.ioc.value");
        MovieRecommender recommender = context.getBean( MovieRecommender.class);
        System.out.println(recommender);
    }
}
