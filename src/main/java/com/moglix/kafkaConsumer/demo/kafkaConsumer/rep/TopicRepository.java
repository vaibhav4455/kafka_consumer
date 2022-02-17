package com.moglix.kafkaConsumer.demo.kafkaConsumer.rep;

import com.moglix.kafkaConsumer.demo.kafkaConsumer.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TopicRepository extends MongoRepository<User,Integer> {
}
