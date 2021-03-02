package org.example.core.ioc.message;

import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Locale;

public class App {
    public static void main(String[] args) {
        MessageSource resources = new ClassPathXmlApplicationContext("messages.xml");
        String message = resources.getMessage("message", null, "Default", Locale.ENGLISH);
        System.out.println(message);
        message = resources.getMessage("argument.required", new Object [] {"userDao"}, "Required", Locale.UK);
        System.out.println(message);
    }
}
