package com.dk.microservice.userservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class UserServiceApplication {

    public static String parentConfigName;
    public static void main(String[] args) {
        System.out.println(parentConfigName);
        SpringApplication.run(UserServiceApplication.class, args);
    }

}
