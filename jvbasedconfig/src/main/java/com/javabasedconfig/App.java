package com.javabasedconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.javabasedconfig.config.Myconfiguration;
;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        ApplicationContext context= new AnnotationConfigApplicationContext(Myconfiguration.class);

        Student t1 =context.getBean(Student.class);

        t1.writeexam();
    }
}
