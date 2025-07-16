package com.sprinboot.springbootf;

import org.springframework.stereotype.Component;

@Component
public class Pen implements Writer{


    public void write(){
        System.err.println("write using pen");
    }

}
