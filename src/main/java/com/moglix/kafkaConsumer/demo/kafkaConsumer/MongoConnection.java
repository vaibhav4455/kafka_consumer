//package com.moglix.kafkaConsumer.demo.kafkaConsumer;
//import com.mongodb.MongoClient;
//import com.mongodb.MongoException;
//
//public class MongoConnection {
//    public static void main(String[] args) {
//        MongoClient mongoClient = null;
//        try {
//            mongoClient = new MongoClient( "127.0.0.1" , 27017 );
//
//            System.out.println("Connected to MongoDB!");
//        } catch (MongoException e) {
//            e.printStackTrace();
//        } finally {
//            if(mongoClient!=null)
//                mongoClient.close();
//        }
//    }
//}
