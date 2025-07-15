package com.javabasedconfig.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.javabasedconfig.Pen;
import com.javabasedconfig.Pencil;
import com.javabasedconfig.Student;
import com.javabasedconfig.Writer;

@Configuration
public class Myconfiguration {
    @Bean
    public Student student(@Qualifier("pen") @Autowired Writer writer){
        Student st = new  Student();
        st.setAge(11);
        st.setName("mohan");
        st.setWriter(writer);
        return  st;
    }
    
    @Bean
    public Pen pen(){
        return new Pen();
    }
    
    @Bean
    @Primary
    public Pencil pencil(){
        return new Pencil();
    }
    
}
