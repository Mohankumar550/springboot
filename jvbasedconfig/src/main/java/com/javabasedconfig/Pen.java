
package com.javabasedconfig;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Primary
public class Pen implements Writer{

    public Pen() {
        System.out.println("Pen constructor");
    }


        public void write(){
        System.out.println("Pen");
    }
}