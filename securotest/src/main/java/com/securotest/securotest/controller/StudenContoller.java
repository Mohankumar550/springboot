package com.securotest.securotest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.securotest.securotest.model.Student;
import com.securotest.securotest.service.StudentService;

import jakarta.servlet.http.HttpServletRequest;




@RestController
public class StudenContoller {

    @Autowired
    StudentService studentService;

    @GetMapping("/")
    public String getHome(HttpServletRequest request) {
        return ":) Welcome to the Spring Application (:  "+request.getSession().getId();
    }
    


    @GetMapping("/students")
    public List<Student> getstudents() {
        System.out.println(studentService.getStudents());
        return studentService.getStudents();
    }

    @PutMapping("/students/{rno}")
    public String putstudents(@PathVariable int rno, @RequestBody Student entity) {


        
        return studentService.updatestudents(rno,entity);
    }

    @PostMapping("/students")
    public String poststudents(@RequestBody Student entity) {
        
        return studentService.addstudents(entity);
    }
    

    @DeleteMapping("/students/{rno}")
    public String deletestudents(@PathVariable int rno){

        return  studentService.deletestudents(rno);

    }

    @GetMapping("/csrf-token")
    public CsrfToken getMethodName(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }

    
    
    
}
