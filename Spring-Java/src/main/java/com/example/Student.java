package com.example;

public class Student {

    private int age;
    private String name;
    private int rno;

    private Writer writer = new Pen();


    //All Args constructor
    public Student(int age,String name,  int rno,Writer writer) {
        System.out.println("para constructor called");

        this.age = age;
        this.name = name;
        this.rno = rno;
        this.writer = writer;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    public Writer getWriter(Writer writer) {
        return writer;

    }

    public void writeexamp() {
        writer.write();
    }

}
