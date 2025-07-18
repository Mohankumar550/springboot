package com.springjpa.demojpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Student {

    @Id
    private int rollno ;
    private int age;
    private String name;
    private String gender;
    private String technology;
    
}
