package com.dk.microservice.courseservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("user-service")
public interface UserServiceProxy {

    @GetMapping("/user-service/{author}")
    Object getAuthorDetails(@PathVariable String author);
}
