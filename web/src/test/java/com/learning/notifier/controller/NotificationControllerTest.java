package com.learning.notifier.controller;

import com.learning.notifier.model.Notification;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class NotificationControllerTest {

    private NotificationController notificationController;



    @Test
    @DisplayName("Should able to send Notification")
    public void should_send_notification(){
        Notification notification = new Notification("12312412", "Android", "Hellp");


    }

}