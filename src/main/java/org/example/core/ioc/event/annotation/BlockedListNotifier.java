package org.example.core.ioc.event.annotation;

import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;

public class BlockedListNotifier {

    private String notificationAddress;

    public void setNotificationAddress(String notificationAddress) {
        this.notificationAddress = notificationAddress;
    }

//    @EventListener
//    @EventListener(BlockedListEvent.class)
//    @EventListener(condition = "#blEvent.content == 'my-event'")
    @EventListener(condition = "#a0.content == 'my-event'")
    @Async
    @Order(42)
    public void onApplicationEvent(BlockedListEvent blEvent) {
        System.out.printf("Email blocked to '%s'\n", blEvent.getAddress());
    }
}