package org.example.event;

import org.springframework.context.ApplicationListener;

public class BlockedListNotifier implements ApplicationListener<BlockedListEvent> {

    private String notificationAddress;

    public void setNotificationAddress(String notificationAddress) {
        this.notificationAddress = notificationAddress;
    }

    public void onApplicationEvent(BlockedListEvent event) {
        System.out.printf("Email blocked to '%s'\n", event.getAddress());
    }
}