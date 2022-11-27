package com.kafkademo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumer {

    @KafkaListener(topics = "message", groupId = "test")
    public void processMessage(String message) {
        System.out.println("Received Message in group test: " + message);
    }
}
