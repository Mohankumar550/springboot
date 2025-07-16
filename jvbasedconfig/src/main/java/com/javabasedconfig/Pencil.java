package com.javabasedconfig;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class  Pencil implements Writer{

    public Pencil(){
        System.out.println("Pencil constructor");
    }


    public void write(){
        System.out.println("pencil");
    }
    
}
