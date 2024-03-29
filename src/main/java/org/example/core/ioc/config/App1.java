package org.example.core.ioc.config;

import org.example.core.ioc.config.transfer.AccountRepository;
import org.example.core.ioc.config.transfer.TransferService;
import org.example.core.ioc.config.transfer.TransferServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan(basePackages = "org.example.core.ioc.config")
public class App1 {

    @Bean
    public MyServiceImpl myService() {
        return new MyServiceImpl();
    }

    @Bean
    public TransferService transferService(AccountRepository accountRepository) {
        return new TransferServiceImpl(accountRepository);
    }

    public static void main(String[] args) {
//        ApplicationContext ctx = new AnnotationConfigApplicationContext(App1.class, MyServiceImpl.class);

//        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
//        ctx.register(App1.class);
//        ctx.register(MyServiceImpl.class);
//        ctx.refresh();

//        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
//        ctx.scan("org.example.core.ioc.config");
//        ctx.refresh();

        ApplicationContext ctx = new AnnotationConfigApplicationContext(App1.class);
        TransferService bean = ctx.getBean(TransferService.class);
        System.out.println(bean);

        Arrays.stream(ctx.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
