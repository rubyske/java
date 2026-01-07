package src.notification.impl;

import src.notification.Notification;

public class EmailNotificationImpl implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Email sent : " + message);
    }
}
