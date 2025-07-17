package com.studencrud.democrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.studencrud.democrud.models.Student;
import com.studencrud.democrud.service.StudentService;




@RestController
public class Studentcontroller {

    @Autowired
    StudentService studentService;


    @GetMapping("/students")
    public List<Student> getStudent() {
        return studentService.getstude();
    }

    @GetMapping("students/{rno}")
    public Student getstudendBynumber(@PathVariable("rno") int rno) {
        return studentService.getstudenbyno(rno);
    }

    @PostMapping("students")
    public String postMethodName(@RequestBody Student student) {

        studentService.addstudent(student);
        
        return "Successfully added";
    }
    
    
    
    
}
