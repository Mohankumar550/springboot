package com.springjpa.demojpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springjpa.demojpa.model.Student;
import com.springjpa.demojpa.respository.StudentsRepo;


@Service
public class StudentService {


    @Autowired
    StudentsRepo studentsRepo;

    public List<Student> getStudents() {

        return studentsRepo.findAll();


    }

    public String createStudent(Student reqstudent) {

        studentsRepo.save(reqstudent);


        return "success";
        
    }

    public Student getstudentsById(int rno) {

        return studentsRepo.findById(rno).orElse(null);
    }

    public String updatestudent(int id, Student entity) {
        studentsRepo.save(entity);
        return "updated";
    }

    public String deletestudentByid(int id){

        studentsRepo.deleteById(id);

        return "Deleted";
    }

    public String deleteallstudent(){

        studentsRepo.deleteAll();

        return  "deleted ALL";
    }

    public List<Student> getstudentsbyTechnology(String tech) {
        return studentsRepo.findBytechnology(tech);
    }

    public List<Student> filtersstudent(String gender, String technology) {
        return studentsRepo.findBygenderandtechnology(gender, technology);
    }
    
}
