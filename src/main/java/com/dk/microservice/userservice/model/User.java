package com.dk.microservice.userservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long Id;
    private String firstName;
    private String lastName;
    private int age;
    private String occupation;
}
