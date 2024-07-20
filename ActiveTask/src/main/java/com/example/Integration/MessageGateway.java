package com.example.Integration;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public interface MessageGateway {
    void sendMessage(String message);
}