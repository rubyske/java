package src.notification.impl;

import src.notification.Notification;

public class PushNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Notif : " + message);
    }
}
