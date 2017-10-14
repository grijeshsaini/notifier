package com.learning.notifier.connector.impl;

import com.learning.notifier.connector.FCMConnector;
import com.learning.notifier.model.FCMRequest;
import com.learning.notifier.model.Notification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by grijesh on 14/10/17.
 */

@Service
public class FCMConnectorImpl implements FCMConnector {

    private final String url;
    private RestTemplate restTemplate;
    private final String serverKey;

    public FCMConnectorImpl(@Value("${firebase.messaging.url}") String url,
                            @Autowired RestTemplate restTemplate,
                            @Value("${firebase.server.key}") String serverKey) {
        this.url = url;
        this.restTemplate = restTemplate;
        this.serverKey = serverKey;
    }

    @Override
    public void sendMessage(Notification notification) {
        HttpEntity<FCMRequest> request = new HttpEntity<>(createRequestMessage(notification),
                createHeaders());
        ResponseEntity<String> exchange = restTemplate.exchange(url, HttpMethod.POST, request, String.class);
        System.out.println(exchange.getBody());
    }

    private HttpHeaders createHeaders(){
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
        headers.add("Authorization", serverKey);
        return headers;
    }

    private FCMRequest createRequestMessage(Notification notification) {
        FCMRequest.NotificationDetails notificationDetails = new FCMRequest.NotificationDetails();
        notificationDetails.setBody(notification.getMesssage().getBody());
        notificationDetails.setPriority("high");
        notificationDetails.setTitle(notification.getMesssage().getTitle());

        return new FCMRequest(new FCMRequest.Data(notification.getMesssage().getBody()), notification.getDeviceId(), notificationDetails);
    }
}

