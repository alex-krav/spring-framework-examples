package org.example.app;

import org.example.service.UserService;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import java.util.List;

public class Application {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");
//        UserService service = context.getBean("bean1", UserService.class);
//        List<String> userList = service.getUsernameList();
//        System.out.println(userList);

        GenericApplicationContext context = new GenericApplicationContext();
        new XmlBeanDefinitionReader(context).loadBeanDefinitions("services.xml");
        context.refresh();
        UserService service = context.getBean("bean1", UserService.class);
        List<String> userList = service.getUsernameList();
        System.out.println(userList);
    }
}
