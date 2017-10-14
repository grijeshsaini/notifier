package com.learning.notifier.service.impl;

import com.learning.notifier.connector.FCMConnector;
import com.learning.notifier.model.Notification;
import com.learning.notifier.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationServiceImpl implements NotificationService {

    private FCMConnector fcmConnector;

    @Autowired
    public NotificationServiceImpl(FCMConnector fcmConnector) {
        this.fcmConnector = fcmConnector;
    }

    @Override
    public void sendMessage(Notification notification) {
        fcmConnector.sendMessage(notification);
    }
}
