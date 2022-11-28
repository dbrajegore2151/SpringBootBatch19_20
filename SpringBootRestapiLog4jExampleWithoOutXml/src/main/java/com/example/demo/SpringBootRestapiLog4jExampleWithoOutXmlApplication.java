package com.example.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRestapiLog4jExampleWithoOutXmlApplication {

	private static final Logger LOGGER = LogManager.getLogger(SpringBootRestapiLog4jExampleWithoOutXmlApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestapiLog4jExampleWithoOutXmlApplication.class, args);
		int i=20;
		if(i>10) {
			LOGGER.info("i is greater");
		}
		
		LOGGER.info("Check This is info level");
		LOGGER.debug("Check This is a debug level");
		//LOGGER.error("This is Exception", new Exception("Only For Check"));
	}

}
