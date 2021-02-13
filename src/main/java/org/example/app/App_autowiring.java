package org.example.app;

import org.example.dependencies.SimpleMovieListerConstructor;
import org.example.dependencies.SimpleMovieListerConstructorMap;
import org.example.dependencies.SimpleMovieListerSetter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App_autowiring {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("autowiring.xml");
//        SimpleMovieListerSetter lister = context.getBean("lister", SimpleMovieListerSetter.class);
//        System.out.println(lister);

//        ApplicationContext context = new ClassPathXmlApplicationContext("autowiring.xml");
//        SimpleMovieListerConstructor lister = context.getBean("lister", SimpleMovieListerConstructor.class);
//        System.out.println(lister);

        ApplicationContext context = new ClassPathXmlApplicationContext("autowiring.xml");
        SimpleMovieListerConstructorMap lister = context.getBean("lister", SimpleMovieListerConstructorMap.class);
        System.out.println(lister);
    }
}
