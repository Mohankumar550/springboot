package com.studcrudi.demostudcrud.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.studcrudi.demostudcrud.model.Student;

@Service
public class Studentservice {




    List<Student>  students=new ArrayList<>(
        Arrays.asList(
            new Student(11,"mohan",14),
            new Student(11,"mohankumar",14)

        )
    );
    


    public List<Student> getStudents(){

        

        return students;

    }



    public Student getstudentbyid(int rolno) {

        int index = 0;
        for(int i=0;i<students.size();i++){
            if(students.get(i).getRolno() == rolno){
                index=i;

            }
        }
        return students.get(index);



    }



    public String addstudent(Student entity) {

        students.add(entity);

        return  "successfull";
        
    }



    public String deletestudent(int rolno) {

        int index = 0;
        boolean found = false;

        for(int i=0;i<students.size();i++){
            if(students.get(i).getRolno() == rolno){
                found=true;
                index=i;

            }
        }

        if(!found) return "not found";
        else{
            students.remove(index);
            return "value delted";
        }
        

    }


}
