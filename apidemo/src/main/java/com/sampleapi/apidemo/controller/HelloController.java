package com.sampleapi.apidemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloController {


    @GetMapping("/")
    public String getMethodName() {
        return "Hello";
    }

    @GetMapping("/about")
    public String abouts() {
        return "i'm Mohankumar";
    }
    
    

    
}
