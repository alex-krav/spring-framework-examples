package org.example.config.imp;

import org.example.config.App1;
import org.example.config.transfer.AccountRepository;
import org.example.config.transfer.AccountRepositoryImpl;
import org.example.config.transfer.TransferService;
import org.example.config.transfer.TransferServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.util.Arrays;

@Configuration
@Import({ConfigA.class, AccountRepositoryImpl.class})
public class ConfigB {

    @Bean
    public TransferService transferService(AccountRepository accountRepository) {
        return new TransferServiceImpl(accountRepository);
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigB.class);
        TransferService bean = ctx.getBean(TransferService.class);
        System.out.println(bean);

        Arrays.stream(ctx.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
