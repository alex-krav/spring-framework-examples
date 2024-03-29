package org.example.core.ioc.config;

import org.example.core.ioc.config.mixed.Employee;
import org.example.core.ioc.config.mixed.MixedConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MixedApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MixedConfig.class);
        Employee employee = context.getBean(Employee.class);
        System.out.println(employee + "\n");

        for (String beanDefinitionName : context.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
    }
}
