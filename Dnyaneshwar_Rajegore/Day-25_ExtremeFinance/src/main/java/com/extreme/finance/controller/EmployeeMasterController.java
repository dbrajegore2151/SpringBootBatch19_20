package com.extreme.finance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.extreme.finance.api.EmpApi;
import com.extreme.finance.model.EmployeeMaster;
import com.extreme.finance.service.EmployeeMasterService;

@RestController
public class EmployeeMasterController {

	
	@Autowired
	private EmployeeMasterService employeeMasterService;
			
	
	@PutMapping(value = EmpApi.UPEMPMASTER)
	public EmployeeMaster updateEmpMaster(@RequestBody EmployeeMaster employeeMaster) {
		
		System.out.println("In Controller : "+employeeMaster);
		
		return employeeMasterService.upDateEmpMaster(employeeMaster);
	}
	
	@DeleteMapping(value = EmpApi.DELETEEMP)
	public EmployeeMaster deleteEmpMaster(@RequestParam int id ) {
		
		System.out.println("In Employee Controller :" + id );
		
		return employeeMasterService.deleteEmpMaster(id);
		
	}
	
	
}
