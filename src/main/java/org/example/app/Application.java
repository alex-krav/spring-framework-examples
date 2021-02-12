package org.example.app;

import org.example.service.ClientService;
import org.example.service.SomeThing;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");
//        UserService service = context.getBean("bean1", UserService.class);
//        List<String> userList = service.getUsernameList();
//        System.out.println(userList);

//        GenericApplicationContext context = new GenericApplicationContext();
//        new XmlBeanDefinitionReader(context).loadBeanDefinitions("services.xml");
//        context.refresh();
//        UserService service = context.getBean("bean1", UserService.class);
//        List<String> userList = service.getUsernameList();
//        System.out.println(userList);

//        BeanDefinition bean1 = context.getBeanDefinition("bean1");
//        System.out.println(bean1);

//        ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");
//        SomeThing.NestedThing nested = context.getBean("nested", SomeThing.NestedThing.class);
//        System.out.println(nested.getName());
//        SomeThing.InnerThing inner = context.getBean("inner", SomeThing.InnerThing.class);
//        System.out.println(inner.getName());

//        ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");
//        ClientService service1 = context.getBean("clientService1", ClientService.class);
//        System.out.println(service1);
//        SomeThing service2 = context.getBean("clientService2", SomeThing.class);
//        System.out.println(service2);

        ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");
        SomeThing service = context.getBean("clientService", SomeThing.class);
        Class<?> serviceType = context.getType("clientService");
        System.out.println(serviceType.getName());
    }
}
