package com.learning.notifier.model;

/**
 * Created by grijesh on 14/10/17.
 */
public class Notification {

    private String deviceId;

    private BasicMessage messsage;


    public Notification() {
    }

    public Notification(String deviceId, BasicMessage messsage) {
        this.deviceId = deviceId;
        this.messsage = messsage;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public BasicMessage getMesssage() {
        return messsage;
    }

    public void setMesssage(BasicMessage messsage) {
        this.messsage = messsage;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "deviceId='" + deviceId + '\'' +
                ", messsage=" + messsage +
                '}';
    }
}
