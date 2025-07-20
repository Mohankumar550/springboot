package com.springjpa.demojpa.controller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Student> getMethodName(@PathVariable("rno") int rno) {
       Student st=studentService.getstudentsById(rno);
       if (st==null){
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
       }
       else{
        return  new ResponseEntity<>(st,HttpStatus.OK);
       }
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

    @GetMapping("students/technolgy/{tech}")
    public List<Student> getstudentsbyTechnology(@PathVariable("tech") String tech) {
        return studentService.getstudentsbyTechnology(tech);
    }

    @PostMapping("/students/filter")
    public List<Student> filtervalue(@Param("gender") String gender ,@Param("technology") String technology) {
        
        return studentService.filtersstudent(gender,technology);
    }
    
    




    
}
