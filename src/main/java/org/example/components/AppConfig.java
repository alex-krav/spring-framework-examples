package org.example.components;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Repository;

@Configuration
//@ComponentScan(basePackages = "org.example.components", annotationConfig="false")
//@ComponentScan("org.example.components")
@ComponentScan(basePackages = "org.example.components",
    includeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern=".*Stub.*Finder"),
    excludeFilters = @ComponentScan.Filter(Repository.class))
public class AppConfig  {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        SimpleMovieLister lister = applicationContext.getBean(SimpleMovieLister.class);
        System.out.println(lister);

//        for (String beanName : applicationContext.getBeanDefinitionNames()) {
//            System.out.println(beanName);
//        }
    }
}
