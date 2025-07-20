package com.springjpa.demojpa.respository;

import java.util.List;

import org.hibernate.query.NativeQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mysql.cj.Query;
import com.springjpa.demojpa.model.Student;

@Repository
public interface StudentsRepo extends JpaRepository<Student,Integer>{

    List<Student> findBytechnology(String technolgy);

    @org.springframework.data.jpa.repository.Query(nativeQuery=true,value="select * from student where gender=:gender and technology=:technology")
    List<Student> findBygenderandtechnology(@Param("gender") String gender,@Param("technology") String technology);
    
}
