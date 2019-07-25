package com.sapient.main.com.sapient.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    public String index(){
        return "Greeting from Spring Boot!";
    }


}
