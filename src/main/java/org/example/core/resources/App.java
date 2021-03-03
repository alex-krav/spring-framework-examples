package org.example.core.resources;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
//        ApplicationContext ctx1 = new ClassPathXmlApplicationContext("core/resources/*Context.xml");
//        Arrays.stream(ctx1.getBeanDefinitionNames()).forEach(System.out::println);
//
//        ApplicationContext ctx2 = new FileSystemXmlApplicationContext("*Context.xml");
//        Arrays.stream(ctx2.getBeanDefinitionNames()).forEach(System.out::println);
//
//        ApplicationContext ctx3 = new ClassPathXmlApplicationContext("classpath:core/resources/*Context.xml");
//        Arrays.stream(ctx3.getBeanDefinitionNames()).forEach(System.out::println);
//
//        ApplicationContext ctx4 = new ClassPathXmlApplicationContext("classpath*:core/resources/classPathContext.xml");
//        Arrays.stream(ctx4.getBeanDefinitionNames()).forEach(System.out::println);

        FileSystemResource relativeResource = new FileSystemResource("fileSystemContext.xml");
        System.out.println(relativeResource.getPath());
        FileSystemResource absoluteResource = new FileSystemResource("C:\\Users\\oakravchuk\\projects\\2021\\spring-framework-examples\\secondFileSystemContext.xml");
        System.out.println(absoluteResource.getPath());

        ApplicationContext ctx5 = new FileSystemXmlApplicationContext("fileSystemContext.xml");
        Arrays.stream(ctx5.getBeanDefinitionNames()).forEach(System.out::println);

        ApplicationContext ctx6 = new FileSystemXmlApplicationContext("/fileSystemContext.xml");
        Arrays.stream(ctx6.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
