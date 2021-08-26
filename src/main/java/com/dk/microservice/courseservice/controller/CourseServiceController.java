package com.dk.microservice.courseservice.controller;

import com.dk.microservice.courseservice.feign.UserServiceProxy;
import com.dk.microservice.courseservice.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseServiceController {

    @Autowired
    UserServiceProxy userServiceProxy;

    @GetMapping("/course-service/{author}/courses")
    public List<Course> getCourses(@PathVariable String author) {

        List<Course> courses = List.of(
                new Course(1001L, "Introduction to computer science", "Adnan Rahman", "10 August 2021", "CS"),
                new Course(1001L, "Design pattern using java", "Adnan Rahman", "20 August 2021", "Java Core"),
                new Course(1001L, "Full Stack development", "Adnan Rahman", "12 August 2021", "Web Development")
        );
        return courses;
    }

    @GetMapping("/course-service/author/{author}/info")
    public Object getAuthorInfo(@PathVariable String author) {
        return userServiceProxy.getAuthorDetails(author);
    }
}
