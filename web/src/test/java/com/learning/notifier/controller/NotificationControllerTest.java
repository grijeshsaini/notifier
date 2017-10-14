package com.learning.notifier.controller;

import com.learning.notifier.model.BasicMessage;
import com.learning.notifier.model.Notification;
import com.learning.notifier.service.NotificationService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.MockitoAnnotations.initMocks;


class NotificationControllerTest {

    private NotificationController notificationController;

    @Mock
    private NotificationService notificationService;

    @BeforeEach
    public void setup() {
        initMocks(this);
        notificationController = new NotificationController(notificationService);
    }


    @Test
    @DisplayName("Should able to send Notification")
    public void should_send_notification() {
        Notification notification = new Notification("12312412", "Android", new BasicMessage("TITLE", "BODY"));
        doNothing().when(notificationService).sendMessage(any());

        ResponseEntity<String> response = notificationController.sendNotification(notification);
        assertEquals(200, response.getStatusCodeValue());
        assertEquals("Sent", response.getBody());
    }

}