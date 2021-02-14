package org.example.app;

import org.example.dependencies.SimpleMovieListerConstructorMap;
import org.example.lifecycle.LifeCycleBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App_lifecycle {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");
        context.registerShutdownHook();
    }
}
