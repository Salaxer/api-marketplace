package com.salaxer.marketplace.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gretting")
public class HelloWorldController {

    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello world 🎈";
    }
}
