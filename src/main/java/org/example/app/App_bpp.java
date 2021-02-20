package org.example.app;

import org.example.bpp.BasicDataSource;
import org.example.bpp.BasicDataSource2;
import org.example.bpp.Messenger;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App_bpp {
    public static void main(final String[] args) throws Exception {
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("bpp.xml");
//        Messenger messenger = ctx.getBean("messenger", Messenger.class);
//        System.out.println(messenger);

//        ApplicationContext ctx = new ClassPathXmlApplicationContext("bpp_property_sources.xml");
//        BasicDataSource dataSource = ctx.getBean("dataSource", BasicDataSource.class);
//        System.out.println(dataSource);

//        ApplicationContext ctx = new ClassPathXmlApplicationContext("bpp_property_sources.xml");
//        BasicDataSource2 dataSource = ctx.getBean("dataSource", BasicDataSource2.class);
//        System.out.println(dataSource);

        ApplicationContext ctx = new ClassPathXmlApplicationContext("bpp.xml");
//        Object bean = ctx.getBean("&myFB");
        Object bean = ctx.getBean("myFB");
        System.out.println(bean);
    }
}
