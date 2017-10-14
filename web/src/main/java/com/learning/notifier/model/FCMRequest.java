package com.learning.notifier.model;

public class FCMRequest {

    private String body;

    private String to;

    private NotificationDetails notificationDetails;

    public FCMRequest() {
    }

    public FCMRequest(String body, String to, NotificationDetails notificationDetails) {
        this.body = body;
        this.to = to;
        this.notificationDetails = notificationDetails;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public NotificationDetails getNotificationDetails() {
        return notificationDetails;
    }

    public void setNotificationDetails(NotificationDetails notificationDetails) {
        this.notificationDetails = notificationDetails;
    }

    /**
     * Created by grijesh on 15/10/17.
     */
    public static class NotificationDetails {
        private String body;

        private String title;

        private String priority;

        public NotificationDetails() {
        }

        public String getBody() {
            return body;
        }

        public void setBody(String body) {
            this.body = body;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getPriority() {
            return priority;
        }

        public void setPriority(String priority) {
            this.priority = priority;
        }
    }
}


