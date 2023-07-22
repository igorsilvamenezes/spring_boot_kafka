package com.menezes;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "menezesTopic",
            groupId = "grupoId"
    )
    void listener(String data) {
        System.out.println("Listener receives: " + data);
    }
}