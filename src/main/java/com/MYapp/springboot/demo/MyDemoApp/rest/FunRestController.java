package com.MYapp.springboot.demo.MyDemoApp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    // In have to show the massage "Hello World"
    @GetMapping("/")
    public String sayHello(){
        return "Hello, Pawan Sir";
    }

}
