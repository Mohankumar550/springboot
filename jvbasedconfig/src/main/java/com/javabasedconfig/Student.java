package com.javabasedconfig;

public class Student {

    private int age;
    private String name;

    private  Writer writer;
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    public Student(){
        System.out.println("Studen consstructor");
    }

    public  void show(){
        System.out.println("IN show Student constructor");
    }

    public void writeexam(){
        writer.write();

    }
    
}
