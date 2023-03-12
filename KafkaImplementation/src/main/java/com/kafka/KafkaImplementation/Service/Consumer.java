package com.kafka.KafkaImplementation.Service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "kiran_topic",groupId = "topic_group")
    public  void listenToTopic(String receiveMessage){

        System.out.println("The receive message from kafka is: "+receiveMessage);

    }

}
