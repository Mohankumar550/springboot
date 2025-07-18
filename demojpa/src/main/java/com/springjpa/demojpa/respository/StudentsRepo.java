package com.springjpa.demojpa.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springjpa.demojpa.model.Student;

@Repository
public interface StudentsRepo extends JpaRepository<Student,Integer>{
    
}
