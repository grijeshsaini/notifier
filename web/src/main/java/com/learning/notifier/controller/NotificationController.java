package com.learning.notifier.controller;


import com.learning.notifier.model.Notification;
import com.learning.notifier.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    private NotificationService notificationService;

    @Autowired
    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping("/notifier/send")
    public ResponseEntity<String> sendNotification(@RequestBody Notification notification) {
        notificationService.sendMessage(notification);
        return ResponseEntity.ok("Sent");
    }
}
