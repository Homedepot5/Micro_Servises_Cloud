package com.sapient.main.com.sapient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String index(){
        return "Greeting from Spring Boot!";
    }


}
