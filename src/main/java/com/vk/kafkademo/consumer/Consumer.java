package com.vk.kafkademo.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "spring-kafka-demo", groupId = "msg-consumers-new")
    public void consumer(String msg) {
        System.out.println("Consumer msg: "+ msg);
    }

}
