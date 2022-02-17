package com.moglix.kafkaConsumer.demo.kafkaConsumer.controller;

import com.moglix.kafkaConsumer.demo.kafkaConsumer.model.User;
import com.moglix.kafkaConsumer.demo.kafkaConsumer.rep.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class Mycontroller {

    @Autowired
     TopicRepository topicRepository;
    @PostMapping("/add")
    public ResponseEntity<?>addUser(@RequestBody User user){

      User save= this.topicRepository.save(user);
      return ResponseEntity.ok(save);
    }
    @GetMapping("/")
    public ResponseEntity<?> getUser(){
        return ResponseEntity.ok(this.topicRepository.findAll());
    }
}
