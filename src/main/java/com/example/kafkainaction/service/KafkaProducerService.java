package com.example.kafkainaction.service;

import com.example.kafkainaction.config.KafkaTopicConfig;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.concurrent.CompletableFuture;

@Service
public class KafkaProducerService {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public void sendMessage(String message) {
        CompletableFuture<SendResult<String, Object>> future =
                kafkaTemplate.send("kafka-in-action", message);
        future.whenComplete((result, exception) -> {
            if(Objects.nonNull(exception)) {
                System.out.println("Sent Message = [" + message + "] with offset=[" +
                        result.getRecordMetadata().offset() + "]"
                        );
            } else {
                System.out.println("Unable to Sen Message = [" + message + "] due to[" +
                        exception.getMessage()
                );
            }
        });
    }

    public void V2SendMessage(String message) {
        CompletableFuture<SendResult<String, Object>> future =
                kafkaTemplate.send("kafka-in-action-1", message);
        future.whenComplete((result, exception) -> {
            if(Objects.nonNull(exception)) {
                System.out.println("Sent Message = [" + message + "] with offset=[" +
                        result.getRecordMetadata().offset() + "]"
                );
            } else {
                System.out.println("Unable to Sen Message = [" + message + "] due to[" +
                        exception.getMessage()
                );
            }
        });
    }
}
