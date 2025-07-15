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

        ApplicationContext test= new ClassPathXmlApplicationContext("springconfig.xml");


        System.out.println( "Hello World!" );

        // Student test= new Student();
        // test.show();
    }
}
