package src.notification.impl;

import src.notification.Notification;

public class SmsNotificationImpl implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sms Sent : " + message);
    }
}
