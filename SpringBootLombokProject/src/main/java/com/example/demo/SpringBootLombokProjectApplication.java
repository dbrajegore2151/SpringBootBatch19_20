package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Employee;

@SpringBootApplication
public class SpringBootLombokProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLombokProjectApplication.class, args);
		
		Employee employee = new Employee();
		employee.setEid(12);employee.setEname("Abcd");employee.setAaddress("Pune");
		
		System.out.println(employee);
		
		//Employee.builder().ename("A").eid(234).aaddress("Mumbai").build();
	}

}
