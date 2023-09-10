package com.example.kafkainaction.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaTopicConfig {


    @Bean
    public NewTopic createTopic() {
        NewTopic newTopic = new NewTopic("kafka-in-action-1", 3, (short)1);
        return newTopic;
    }
}
