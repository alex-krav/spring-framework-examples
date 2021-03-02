package org.example.core.ioc.app;

import org.example.core.ioc.dependencies.SimpleMovieListerConstructorMap;
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
