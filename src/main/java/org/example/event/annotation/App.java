package org.example.event.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;

public class App {

    private static List<String> emails = Arrays.asList("known.spammer@example.org", "vasya@gmail.com");

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("events.xml");
        EmailService service = context.getBean(EmailService.class);
        for (String email : emails) {
            service.sendEmail(email, "Happy New Year!");
            service.sendEmail(email, "my-event");
        }
    }
}
