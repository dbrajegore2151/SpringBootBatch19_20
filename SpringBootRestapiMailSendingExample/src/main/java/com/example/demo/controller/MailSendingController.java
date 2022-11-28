package com.example.demo.controller;

import java.io.File;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailSendingController {
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	@GetMapping(value = "/sendMail")
	public String sendingMail() {
		
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo("akshaybade9@gmail.com","nayansatpute22@gmail.com","vanvedd123@gmail.com","rajguruvicky33@gmail.com","shreepatil9347@gmail.com");
		message.setSubject("This mail Send For Testing...!");
		message.setText("Hello This mail Generated From Spring Boot Application......!");
		
		javaMailSender.send(message);
		
		return "Mail Send SuccessFully";
	}
	
	@GetMapping(value = "/sendFile")
	public String sendingFile() throws MessagingException {
		
		MimeMessage mimeMessage = javaMailSender.createMimeMessage();
		
		MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,true);
		
		helper.setTo("ajasshaikh8390@gmail.com");
		helper.setSubject("File Sending or Attachment Send");
		helper.setText("Check File ...!");
		
		ClassPathResource classPathResource = new ClassPathResource("Check.txt");
		
		helper.addAttachment(classPathResource.getFilename(), classPathResource);
		
//		FileSystemResource file = new FileSystemResource("F:\\Check.txt");
//		helper.addAttachment(file.getFilename(), file);
		
		javaMailSender.send(mimeMessage);
		
		return "Mail Send With Attachment SuccessFully....!";
	}

}
