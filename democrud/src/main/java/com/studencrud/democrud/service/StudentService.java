package com.studencrud.democrud.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.studencrud.democrud.models.Student;

@Service
public class StudentService {

    List<Student> students = new ArrayList<>(
            Arrays.asList(
                    new Student(1, "mohan", "ML"),
                    new Student(2, "mohankumar", "CS")
            )
    );

    public List<Student> getstude() {

        return students;

    }

    public Student getstudenbyno(int rno) {

        int index = 0;
        boolean found = false;

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getRollno() == rno) {
                index = i;
                found=true;
                break;
            }

        }

        // if(!found) {
        //     return "No such no found";
        // }
        // else{
            return students.get(index);

        // }        

    }

    public void addstudent(Student student) {
        students.add(student);
    }

    public String updatestud(int rno1, Student entity) {

        int index1 = 0;
        boolean found=false;

        for (int j = 0; j < students.size(); j++) {
            if (students.get(j).getRollno() == rno1) {
                index1 = j;
                found=true;
                break;
            }

        }

        if (!found) return "not found the roll no";
        else{
            students.set(index1, entity);
            return "updated successfully";

        }

    }

        public String deletestudent(int rolno) {

        int index = 0;
        boolean found = false;

        for(int i=0;i<students.size();i++){
            if(students.get(i).getRollno() == rolno){
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
