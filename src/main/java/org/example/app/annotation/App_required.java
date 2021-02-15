package org.example.app.annotation;

import org.example.required.MovieRecommender;
import org.example.required.SimpleMovieLister;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App_required {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("annotation/annotation.xml");
//        SimpleMovieLister lister = context.getBean("lister", SimpleMovieLister.class);
//        System.out.println(lister);

        ApplicationContext context = new ClassPathXmlApplicationContext("annotation/annotation.xml");
        MovieRecommender recommender = context.getBean("recommender", MovieRecommender.class);
        System.out.println(recommender);
    }
}
