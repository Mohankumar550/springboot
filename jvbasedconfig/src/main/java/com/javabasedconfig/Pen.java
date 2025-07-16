
package com.javabasedconfig;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
@Qualifier
public class Pen implements Writer{

    public Pen() {
        System.out.println("Pen constructor");
    }


        public void write(){
        System.out.println("Pen");
    }
}