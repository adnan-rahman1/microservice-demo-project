package com.dk.microservice.serverconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ServerConfigApplication {

    @Value("${central.config.name}")
    private static String parentConfigName;
    public static void main(String[] args) {
        System.out.println(parentConfigName);
        SpringApplication.run(ServerConfigApplication.class, args);
    }

}
