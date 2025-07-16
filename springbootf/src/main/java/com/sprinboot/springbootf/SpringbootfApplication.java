package com.sprinboot.springbootf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootfApplication {

	public static void main(String[] args) {
		ApplicationContext stu =SpringApplication.run(SpringbootfApplication.class, args);

		Student s1 = stu.getBean(Student.class); //new studend injecting the dependency

		s1.show();
	}

}
