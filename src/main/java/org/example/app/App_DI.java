package org.example.app;

import org.example.dependencies.ExampleBean;
import org.example.dependencies.SimpleMovieListerConstructor;
import org.example.dependencies.SimpleMovieListerSetter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App_DI {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("dependencies.xml");
//        SimpleMovieLister lister = context.getBean("lister", SimpleMovieLister.class);
//        System.out.println(lister);

//        ApplicationContext context = new ClassPathXmlApplicationContext("dependencies.xml");
//        ExampleBean exampleBean = context.getBean("exampleBean", ExampleBean.class);
//        System.out.println(exampleBean);

        ApplicationContext context = new ClassPathXmlApplicationContext("dependencies.xml");
        SimpleMovieListerConstructor lister1 = context.getBean("lister1", SimpleMovieListerConstructor.class);
        SimpleMovieListerSetter lister2 = context.getBean("lister2", SimpleMovieListerSetter.class);
        System.out.println(lister1);
        System.out.println(lister2);
    }
}
