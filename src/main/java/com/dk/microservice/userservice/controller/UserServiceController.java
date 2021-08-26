package com.dk.microservice.userservice.controller;

import com.dk.microservice.userservice.feign.CourseServiceProxy;
import com.dk.microservice.userservice.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserServiceController {

    @Autowired
    CourseServiceProxy courseServiceProxy;

    @GetMapping("/user-service/{name}")
    public User getUser(@PathVariable String name) {
        return new User(
                1000L,
                "Adnan",
                "Rahman",
                27,
                "Software Engineer"
        );
    }
    @Value("${central.config.name}")
    private String parentConfig;

    @GetMapping("/user-service/{author}/courses")
    public List<?> getCourse(@PathVariable String author) {
        System.out.println(parentConfig);

        List<?> courses = courseServiceProxy.getCourses(author);
        return courses;
    }
}
