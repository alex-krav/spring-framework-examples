package org.example.app.annotation;

import org.example.qualifier.CustomMovieRecommender;
import org.example.qualifier.MovieRecommender;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App_qualifier {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("annotation/qualifier.xml");
//        MovieRecommender recommender = context.getBean("recommender", MovieRecommender.class);
//        System.out.println(recommender);

        ApplicationContext context = new ClassPathXmlApplicationContext("annotation/c   ustomQualifier.xml");
        CustomMovieRecommender recommender = context.getBean("recommender", CustomMovieRecommender.class);
        System.out.println(recommender);
    }
}
