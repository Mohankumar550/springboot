package com.sampleapi.apidemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sampleapi.apidemo.service.HelloService;




@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;


    @GetMapping("/")
    public String getMethodName() {
        return "Hello";
    }

    @GetMapping("/about")
    public String abouts() {
        return "i'm Mohankumar";
    }

    @GetMapping("/hello")
    public String Hello() {
        return helloService.greet();
    }
    
    
    

    
}
