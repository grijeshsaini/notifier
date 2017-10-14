package com.learning.notifier.model;

/**
 * Created by grijesh on 14/10/17.
 */
public class Notification {

    private String deviceId;

    private String deviceType;

    private String messsage;


    public Notification() {
    }

    public Notification(String deviceId, String deviceType, String messsage) {
        this.deviceId = deviceId;
        this.deviceType = deviceType;
        this.messsage = messsage;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getMesssage() {
        return messsage;
    }

    public void setMesssage(String messsage) {
        this.messsage = messsage;
    }
}
