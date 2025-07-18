package com.studcrudi.demostudcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.studcrudi.demostudcrud.model.Student;
import com.studcrudi.demostudcrud.service.Studentservice;



@RestController
public class Studentcontroller {

    @Autowired
    private Studentservice studentservice;

    @GetMapping("/")
    public String getMethodName() {
        return "Hello World";
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
        return studentservice.getStudents();
    }

    @GetMapping("/students/{rno}")
    public Student getstudentsByrno(@PathVariable("rno") int rno){

        return studentservice.getstudentbyid(rno);

    }

    @PostMapping("students")
    public String postMethodName(@RequestBody Student entity) {
        
        return studentservice.addstudent(entity);
    }

    @DeleteMapping("students/{rno}")
    public String deletemap(@PathVariable("rno") int rno){

        return studentservice.deletestudent(rno);

    }
    

    

    

    
    
}
