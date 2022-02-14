package com.moglix.kafkaConsumer.demo.kafkaConsumer.listner;


import com.moglix.kafkaConsumer.demo.kafkaConsumer.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;



@Service
public class KafkaConsumer {

@KafkaListener(topics ="test-v",groupId="121001")
  public  void consume(String message) {
    System.out.println("consumed message--"+message);
}
@KafkaListener(topics = "test_v_json",groupId = "group_json",containerFactory = "userKafkaListnerFactory")
public void consumerJson(User user){
  System.out.println("consumed json");
}


}
