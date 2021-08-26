package com.dk.microservice.userservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient("course-service")
public interface CourseServiceProxy {

    @GetMapping("/course-service/{author}/courses")
    List<?> getCourses(@PathVariable String author);
}
