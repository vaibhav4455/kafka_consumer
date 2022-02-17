package com.moglix.kafkaConsumer.demo.kafkaConsumer.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="kafkaUser")
public class User {
    private String name;
    private String dept;

    public User(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }
}
