package com.example.Integration;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;


@Component
public class MessageConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(MessageConsumer.class);

    @JmsListener(destination = "Active-queue")
    public void messageListener(Invoice invoice) {
        LOGGER.info("Message received! {}", invoice);
    }
}
