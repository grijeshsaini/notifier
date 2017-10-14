package com.learning.notifier.service;

import com.learning.notifier.model.Notification;

public interface NotificationService {
    void sendMessage(Notification notification);
}
