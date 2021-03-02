package org.example.core.ioc.proxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example.core.ioc.proxy")
public /*final*/ class App {

    @Autowired
    private Config staticConfig;

//    @Bean
//    public static BeanPostProcessor tracer() {
//        return new InstantiationTracingBeanPostProcessor();
//    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);

//        MyBean configBean = context.getBean("configBean", MyBean.class);
//        MyBean componentBean = context.getBean("componentBean", MyBean.class);
//        MyBean staticBean = context.getBean(MyBean.class);
//        System.out.println(configBean + "\n");
//        System.out.println(componentBean + "\n");
//        System.out.println(staticBean + "\n");

        StaticConfig bean = context.getBean(StaticConfig.class);
        System.out.println(bean.getName() + "\n");

        for (String beanDefinitionName : context.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
    }
}
