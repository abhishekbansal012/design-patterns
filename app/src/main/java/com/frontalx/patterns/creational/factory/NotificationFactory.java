package com.frontalx.patterns.creational.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class NotificationFactory {

    private static final Map<String, Supplier<Notification>> notificationMap = new HashMap<>();

    static {
        notificationMap.put("EMAIL", EmailNotification::new);
        notificationMap.put("SMS", SMSNotification::new);
        notificationMap.put("PUSH", PushNotification::new);
    }

    public static Notification createNotification(String type) {
        Supplier<Notification> notification = notificationMap.get(type.toUpperCase());
        if (notification != null) {
            return notification.get();
        }
        throw new IllegalArgumentException("Invalid notification type: " + type);
    }

}
