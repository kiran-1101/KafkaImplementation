package com.kafka.KafkaImplementation.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

@Service
public class Producer {

    @Autowired
    KafkaTemplate<String,String> kafkaTemplate;

    public void sendMsgToTopic(String message){
        kafkaTemplate.send("att_topic",message);
    }

}
