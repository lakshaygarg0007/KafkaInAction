package com.example.kafkainaction.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    Logger log = LoggerFactory.getLogger(KafkaConsumerService.class);

    @KafkaListener(topics = {"kafka-in-action", "kafka-in-action-1"})
    public void consumeMessages(String message) {
        log.info("consumer1 consume the message {}", message);
    }

    @KafkaListener(topics = {"kafka-in-action", "kafka-in-action-1"})
    public void V2ConsumeMessages(String message) {
        log.info("consumer2 consume the message {}", message);
    }

    @KafkaListener(topics = {"kafka-in-action", "kafka-in-action-1"})
    public void V3ConsumeMessages(String message) {
        log.info("consumer3 consume the message {}", message);
    }

    @KafkaListener(topics = {"kafka-in-action", "kafka-in-action-1"})
    public void V4ConsumeMessages(String message) {
        log.info("consumer4 consume the message {}", message);
    }
}
