package com.kafkademo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KafkaDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaDemoApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(MessageProducer producer) {
        return args -> {
            for (int i = 0; i < 100; i++) producer.send("Hello, world!");
        };
    }
}
