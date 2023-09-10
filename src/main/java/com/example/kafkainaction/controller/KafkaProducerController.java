package com.example.kafkainaction.controller;

import com.example.kafkainaction.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaProducerController {

    @Autowired
    private KafkaProducerService kafkaProducerService;

    /**
     * Topic used here is named - kafka-in-action
     * It is has one partition
     **/

    @PostMapping("/send")
    public ResponseEntity<?> sendMessage(@RequestParam("message") String message) {
        try {
            kafkaProducerService.sendMessage(message);
            return ResponseEntity.ok("Message Published Successfully");
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    /**
     * Topic used here is named - kafka-in-acton-1
     * It is has three partition
     **/

    @PostMapping("/v2/send")
    public ResponseEntity<?> V2sendMessage(@RequestParam("message") String message) {
        try {
            for(int i = 0; i < 10000; i++) {
                kafkaProducerService.V2SendMessage(message);
            }
            return ResponseEntity.ok("Message Published Successfully");
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

}