package com.example.kafkaexample.controller;

import com.example.kafkaexample.service.KafkaProducerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/kafka")
@RestController
public class KafkaProducerController {

    private final KafkaProducerService kafkaProducerService;

    @PostMapping
    public ResponseEntity<Void> sendMassage(
            @RequestParam String message) {
        this.kafkaProducerService.sendMessageToKafka(message);
        return ResponseEntity.ok().build();
    }
}
