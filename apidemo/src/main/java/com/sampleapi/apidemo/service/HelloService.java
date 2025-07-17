package com.sampleapi.apidemo.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {


    public HelloService(){
        System.out.println("create Hello service");
    }

    public String greet(){
        //Bussiness Logic
        return "test";
    }


    
}
