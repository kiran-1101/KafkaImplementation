package com.kafka.KafkaImplementation.Controller;

import com.kafka.KafkaImplementation.Service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api")
public class RestControllerForKafkaMsg {

    @Autowired
    Producer producer;
    @GetMapping("/producermsg")
    public  void getMessageFromClient(@RequestParam ("message") String message){

        producer.sendMsgToTopic(message);


    }



}
