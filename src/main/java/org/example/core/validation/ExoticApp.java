package org.example.core.validation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExoticApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("core/validation/exotic.xml");
        DependsOnExoticType bean = context.getBean(DependsOnExoticType.class);
        System.out.println(bean);
    }
}
