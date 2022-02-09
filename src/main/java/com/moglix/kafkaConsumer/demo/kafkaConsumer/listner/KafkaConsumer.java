package com.moglix.kafkaConsumer.demo.kafkaConsumer.listner;


import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KafkaConsumer {
  String topic;
@KafkaListener(topics="data_lake.moglix.customer_order",groupId="group_id")
  public  void consume(List<String> message,@Header(KafkaHeaders.RECEIVED_TOPIC) String topic) {
    System.out.println("consumed message--"+message);
  this.topic = topic.split(",")[0];
  for (int position = 0; position < message.size(); position++) {
    String itemJSON = message.get(position);
 try {


   ObjectMapper mapper = new ObjectMapper();

   mapper.configure(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS, true);
   String jsonNode = mapper.readTree(itemJSON).get("payload").get("after").textValue();
   if (null == jsonNode) {
     jsonNode = mapper.readTree(itemJSON).get("payload").get("patch").textValue();
   }

   JsonNode itemNode = mapper.readTree(jsonNode);
 }
 catch(Exception e){
   System.out.println(e);
    }
  }
}
}
