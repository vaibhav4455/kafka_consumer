package com.moglix.kafkaConsumer.demo.kafkaConsumer.listner;


import com.moglix.kafkaConsumer.demo.kafkaConsumer.model.User;
import com.moglix.kafkaConsumer.demo.kafkaConsumer.model.messages;
import com.moglix.kafkaConsumer.demo.kafkaConsumer.rep.MessageRepo;
import com.moglix.kafkaConsumer.demo.kafkaConsumer.rep.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
@Service
public class KafkaConsumer {
  @Autowired
    MessageRepo messageRepo;

@KafkaListener(topics ="testt-v",groupId="121001")
  public  void consume(String output) {
    System.out.println("consumed message--"+output);
     //this.messageRepo.save(output);
  messages ob=new messages();
  ob.setMessage(output);
  System.out.println("your message is "+ob.getMessage());

  messages save=this.messageRepo.save(ob);




}
@KafkaListener(topics = "test_v_json",groupId = "group_json",containerFactory = "userKafkaListnerFactory")
public void consumerJson(User user){
  System.out.println("consumed json"+ user);
}



}
