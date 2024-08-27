package com.bankmanagementsystem.bankmanagementsystem.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {

    @GetMapping("/heelo")
    public String hello(){
        return "Hello, Spring Boot!";
    }
}
