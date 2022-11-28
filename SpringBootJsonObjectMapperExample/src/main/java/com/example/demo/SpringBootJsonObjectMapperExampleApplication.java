package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class SpringBootJsonObjectMapperExampleApplication {

	public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(SpringBootJsonObjectMapperExampleApplication.class, args);
		
		Student student = new Student();
		student.setSid(234);student.setSname("Anonymous");student.setAddress("Pune");
		System.out.println("Java Object : " + student);
		//Java To Json Convert
		
		ObjectMapper objectMapper = new ObjectMapper();
		String str = objectMapper.writeValueAsString(student);
		System.out.println(str);
		
		//json to java Conversion
		
		Student stu = objectMapper.readValue(str, Student.class);
		System.out.println("Json To Java : " + stu);
	}

}
