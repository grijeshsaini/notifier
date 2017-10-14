package com.learning.notifier.connector;

import com.learning.notifier.model.Notification;

/**
 * Created by grijesh on 14/10/17.
 */
public interface FCMConnector {
    void sendMessage(Notification notification);
}
