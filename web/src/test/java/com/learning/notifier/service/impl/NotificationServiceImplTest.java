package com.learning.notifier.service.impl;

import com.learning.notifier.connector.FCMConnector;
import com.learning.notifier.model.BasicMessage;
import com.learning.notifier.model.Notification;
import com.learning.notifier.service.NotificationService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;

/**
 * Created by grijesh on 14/10/17.
 */
class NotificationServiceImplTest {

    private NotificationService notificationService;

    @Mock
    private FCMConnector fcmConnector;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
        notificationService = new NotificationServiceImpl(fcmConnector);
    }

    @Test
    @DisplayName("Should send notification")
    public void should_send_message() {
        Notification notification = new Notification("12312412", "Android", new BasicMessage("TITLE", "BODY"));
        doNothing().when(fcmConnector).sendMessage(any());

        notificationService.sendMessage(notification);

        verify(fcmConnector, Mockito.times(1)).sendMessage(Matchers.eq(notification));
    }
}