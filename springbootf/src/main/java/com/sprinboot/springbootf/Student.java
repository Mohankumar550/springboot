package com.sprinboot.springbootf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student{

    public int age;
    private Writer writer;
    private Pen pen;

    @Autowired
    
    public Student(@Qualifier("pencil") Writer writer){
        this.writer= writer;
    }



    public void show(){
        System.out.println("Showing Students");
    }



    public void writeexam(){
        this.writer.write();

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Writer getWrite() {
        return writer;
    }

    public void setWrite(Writer write) {
        this.writer = write;
    }

}
