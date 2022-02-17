package com.moglix.kafkaConsumer.demo.kafkaConsumer.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "topicsData")
public class messages {
    String message;
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public messages() {
        this.message = message;
    }
    @Override
    public String toString() {
        return "message{" +
                "message='" + message + '\'' +
                '}';
    }
}
