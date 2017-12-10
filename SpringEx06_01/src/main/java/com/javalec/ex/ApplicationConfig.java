package com.javalec.ex;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
	
	@Bean
	public Student student1() {
		
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("취미1");
		hobbys.add("취미2");
		
		Student student = new Student("1번", hobbys);
		student.setHeight(173);
		student.setWeight(65);
		
		return student;
		
	}
	
	@Bean
	public Student student2() {
		
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("취미3");
		hobbys.add("취미4");
		
		Student student = new Student("2번", hobbys);
		student.setHeight(168);
		student.setWeight(60);
		
		return student;
		
	}
}
