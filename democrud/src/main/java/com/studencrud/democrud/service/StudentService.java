package com.studencrud.democrud.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.studencrud.democrud.models.Student;

@Service
public class StudentService {

    List<Student> students =new ArrayList<>(
        Arrays.asList(
            new Student(1,"mohan","ML"),
            new Student(2,"mohankumar","CS")

        )
    );


        public List<Student> getstude() {

                return students;



    }


        public Student getstudenbyno(int rno) {

            int index=0;


            for(int i=0;i<students.size();i++){
                if (students.get(i).getRollno()==rno)

                index=i;
                
            }

            return students.get(index);
            
        }

    public void addstudent(Student student) {
        students.add(student);
    }
    
    }