package com.learning.notifier.model;

/**
 * Created by grijesh on 14/10/17.
 */
public class BasicMessage {

    private String title;

    private String body;

    public BasicMessage(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public BasicMessage() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
