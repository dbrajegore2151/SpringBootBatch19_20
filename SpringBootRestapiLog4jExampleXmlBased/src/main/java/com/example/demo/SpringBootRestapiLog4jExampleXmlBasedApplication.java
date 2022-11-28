package com.example.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRestapiLog4jExampleXmlBasedApplication {

	private static final Logger LOGGER = LogManager.getLogger(SpringBootRestapiLog4jExampleXmlBasedApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestapiLog4jExampleXmlBasedApplication.class, args);
		
		System.out.println("Hi this is SOP statement");
		
		LOGGER.info("This is an info level");
		LOGGER.warn("This is a warn level");
		LOGGER.debug("This is a debug level");
		
		LOGGER.error("This is error level");
		LOGGER.fatal("This is Fatal level");
	}

}
