package com.extreme.finance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.extreme.finance.api.ApiEndpoints;
import com.extreme.finance.dto.EmployeeMasterDto;
import com.extreme.finance.model.Login;
import com.extreme.finance.service.LoginService;

@RestController
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	
	@PostMapping(value = ApiEndpoints.ADDEMPLOYEE)
	public String AddLoginAndEmployeeData(@RequestBody Login login) {
		System.out.println("Employee In Controller : "+login);
		loginService.addLoginDataWithEmployee(login);
		
		return "Employee Added....!";
	}
	
	@PostMapping(value = ApiEndpoints.LOGIN)
	public ResponseEntity<EmployeeMasterDto> getAllLoginData(@RequestBody Login login){
		
		System.out.println("In login Controller : "+login);
		EmployeeMasterDto employeeMasterDto =  loginService.getLoginData(login.getUname(), login.getPass());
		
		return ResponseEntity.ok(employeeMasterDto);
	}
	
}
