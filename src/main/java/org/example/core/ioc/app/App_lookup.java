package org.example.core.ioc.app;

import org.example.core.ioc.lookup.CommandManagerLookup;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App_lookup {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = new ClassPathXmlApplicationContext("lookup.xml");
        CommandManagerLookup commandManager = context.getBean("commandManager", CommandManagerLookup.class);

        for (int i = 0; i < 5; i++) {
            commandManager.process();
            Thread.sleep(1000);
        }
    }
}
