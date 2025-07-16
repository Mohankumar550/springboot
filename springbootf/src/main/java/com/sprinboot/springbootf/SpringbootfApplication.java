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
		s1.age=100;
		System.out.println(s1.age);
		




		Student s2 = stu.getBean(Student.class); //new studend injecting the dependency
		System.out.println(s2.age);

		s2.show();

		s2.writeexam();
	}

}
