package org.example.app.annotation;

import org.example.qualifier.CustomMovieRecommender;
import org.example.resource.SimpleMovieLister;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App_resource {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("annotation/resource.xml");
        SimpleMovieLister lister = context.getBean("lister", SimpleMovieLister.class);
        System.out.println(lister);
    }
}
