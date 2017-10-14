package com.learning.notifier.connector.impl;

import com.learning.notifier.connector.FCMConnector;
import com.learning.notifier.model.BasicMessage;
import com.learning.notifier.model.FCMRequest;
import com.learning.notifier.model.Notification;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Created by grijesh on 15/10/17.
 */
class FCMConnectorImplTest {

    @Mock
    private RestTemplate restTemplate;

    private FCMConnector fcmConnector;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
        fcmConnector = new FCMConnectorImpl("localhost", restTemplate, "SERVER_KEY");
    }

    @Test
    @DisplayName("Should send message")
    public void should_send_message() {
        Notification notification = new Notification("12312412", new BasicMessage("TITLE", "BODY"));
        Mockito.when(restTemplate.exchange(Matchers.eq("localhost"),
                Matchers.eq(HttpMethod.POST),
                Matchers.<HttpEntity<FCMRequest>>any(),
                Matchers.eq(String.class))).thenReturn(new ResponseEntity<String>("Test", HttpStatus.OK));

        fcmConnector.sendMessage(notification);
    }

}