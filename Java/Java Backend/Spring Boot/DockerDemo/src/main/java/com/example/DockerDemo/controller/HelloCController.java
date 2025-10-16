package com.example.DockerDemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCController {

    @RequestMapping("/")
    public String greet() {
        return "Hello World";
    }
}
