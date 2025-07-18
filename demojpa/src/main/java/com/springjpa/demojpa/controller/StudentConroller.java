package com.springjpa.demojpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springjpa.demojpa.model.Student;
import com.springjpa.demojpa.service.StudentService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
public class StudentConroller {
    
    @Autowired
    private StudentService studentService;



    @GetMapping("/students")
    public List<Student> getStudents(){
        return studentService.getStudents();
    }

    @PostMapping("/students")
    public String createStudent(@RequestBody Student reqStudent) {

        return studentService.createStudent(reqStudent);
        
    }

    @GetMapping("/students/{rno}")
    public Student getMethodName(@PathVariable("rno") int rno) {
        return studentService.getstudentsById(rno);
    }

    @PutMapping("students/{id}")
    public String putMethodName(@PathVariable int id, @RequestBody Student entity) {
        
        return studentService.updatestudent(id,entity);
    }
    

    @DeleteMapping("students/{id}")
    public String deletebyid(@PathVariable("id") int id){

        return studentService.deletestudentByid(id);

    }
    
    @DeleteMapping("students/clear")
    public String deleteall(){
        return studentService.deleteallstudent();
    }




    
}
