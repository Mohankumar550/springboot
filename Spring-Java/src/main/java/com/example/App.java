package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext n1= new ClassPathXmlApplicationContext("springconfig.xml");
        System.out.println( "Hello World!" );

        Student student=(Student) n1.getBean("st1");
        // student.setAge(34);
        student.writeexamp();

        

        
 
    }
}
