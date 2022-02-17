package com.moglix.kafkaConsumer.demo.kafkaConsumer.rep;

import com.moglix.kafkaConsumer.demo.kafkaConsumer.model.messages;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MessageRepo extends MongoRepository<messages,String> {


}
