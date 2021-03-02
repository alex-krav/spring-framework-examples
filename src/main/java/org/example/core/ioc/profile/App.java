package org.example.core.ioc.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(/*AppConfig.class*/);
        context.getEnvironment().setDefaultProfiles("asdf");
        context.getEnvironment().setActiveProfiles("development","one","two");
        context.register(AppConfig.class);
        context.refresh();

        for (String beanDefinitionName : context.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
    }
}
