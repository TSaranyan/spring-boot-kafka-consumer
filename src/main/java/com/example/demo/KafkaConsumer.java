package com.example.demo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "mails")
    public void displayMail(String mail) {
        System.out.println(" Received: " + mail);
    }
}
