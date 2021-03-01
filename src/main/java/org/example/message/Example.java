package org.example.message;

import org.springframework.context.MessageSource;

import java.util.Locale;

public class Example {
    private MessageSource messages;

    public void setMessages(MessageSource messages) {
        this.messages = messages;
    }

    public void execute() {
        String message = this.messages.getMessage("argument.required",
                new Object [] {"userDao"}, "Required", Locale.ENGLISH);
        System.out.println(message);
    }
}
