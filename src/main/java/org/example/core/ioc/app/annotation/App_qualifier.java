package org.example.core.ioc.app.annotation;

import org.example.core.ioc.qualifier.CustomMovieRecommender;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App_qualifier {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("annotation/qualifier.xml");
//        MovieRecommender recommender = context.getBean("recommender", MovieRecommender.class);
//        System.out.println(recommender);

        ApplicationContext context = new ClassPathXmlApplicationContext("core/ioc/annotation/c   ustomQualifier.xml");
        CustomMovieRecommender recommender = context.getBean("recommender", CustomMovieRecommender.class);
        System.out.println(recommender);
    }
}
