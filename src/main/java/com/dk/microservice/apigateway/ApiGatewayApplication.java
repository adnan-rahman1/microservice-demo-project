package com.dk.microservice.apigateway;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class ApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayApplication.class, args);
    }


//    @Bean
//    public RouteLocator getCustomRoute(RouteLocatorBuilder routeLocatorBuilder) {
//        return routeLocatorBuilder
//                .routes()
//                .route(
//                        p -> p.path("/user-service/**").uri("lb://user-service")
//                )
//                .route(
//                        p -> p.path("/course-service/**").uri("lb://course-service")
//                )
//                .build();
//    }
}
