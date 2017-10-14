package com.learning.notifier.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FCMRequest {

    private Data data;

    private String to;

    @JsonProperty("notification")
    private NotificationDetails notificationDetails;

    public FCMRequest() {
    }

    public FCMRequest(Data data, String to, NotificationDetails notificationDetails) {
        this.data = data;
        this.to = to;
        this.notificationDetails = notificationDetails;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
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

    public static class Data {
        private String message;

        public Data() {
        }

        public Data(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
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


