package org.example.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.env.MutablePropertySources;

public class App {
    public static void main(String[] args) {
//        ConfigurableApplicationContext ctx = new GenericApplicationContext();
//        MutablePropertySources sources = ctx.getEnvironment().getPropertySources();
//        sources.addFirst(new MyPropertySource());

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        for (String beanDefinitionName : context.getBeanDefinitionNames()) {System.out.println(beanDefinitionName);}
        System.out.println();
        TestBean bean = context.getBean(TestBean.class);
        System.out.println(bean);

        System.out.println("=============== System.getenv() ================");
        System.out.println(System.getenv());
        System.out.println("=============== System.getProperties() ================");
        System.out.println(System.getProperties());
    }
}
