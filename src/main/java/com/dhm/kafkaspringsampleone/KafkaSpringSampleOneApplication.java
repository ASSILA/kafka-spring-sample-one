package com.dhm.kafkaspringsampleone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
public class KafkaSpringSampleOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaSpringSampleOneApplication.class, args);
    }

}
