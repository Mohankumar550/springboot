package com.securotest.securotest.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.securotest.securotest.model.Student;


@Service
public class StudentService {

    List<Student> students= new ArrayList<>(
        Arrays.asList(
            new Student(1, "mohan", "CSE"),
            new Student(2, "ovi", "IT")
        )
    );

    public List<Student> getStudents() {

        return students;
        
    }

    public String updatestudents(int rno, Student entity) {

        int index=0;
        boolean found = false;

        for (int i=0;i<students.size();i++){
            if(students.get(index).getRollno() == rno){
                index=i;
                found=true;
                break;
            }
        }

        if (found){
            students.add(index, entity);
            return "updated successfully";
        }
        else{
            return "Rno not found";
        }

    }

    public String deletestudents(int rno) {

                int index=0;
        boolean found = false;

        for (int i=0;i<students.size();i++){
            if(students.get(index).getRollno() == rno){
                index=i;
                found=true;
                break;
            }
        }

        if (found){
            students.remove(index);
            return "Removed successfully";
        }
        else{
            return "Rno not found";
        }

    }

    public String addstudents(Student entity) {

        students.add(entity);
        return  "Added successfully";
       
    }


    
}
