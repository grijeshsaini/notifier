package com.learning.notifier.connector.impl;

import com.learning.notifier.connector.FCMConnector;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by grijesh on 15/10/17.
 */
class FCMConnectorImplTest {

    @Mock
    private RestTemplate restTemplate;

    private FCMConnector fcmConnector;

    @BeforeEach
    public void setup(){
        MockitoAnnotations.initMocks(this);
        fcmConnector = new FCMConnectorImpl("localhost", restTemplate, "SERVER_KEY");
    }


}