package com.extreme.finance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.extreme.finance.api.ApiEndpoints;
import com.extreme.finance.model.FinanceMaster;
import com.extreme.finance.service.FinanceMasterService;

@RestController
public class FinanceController {

	@Autowired
	private FinanceMasterService financeMasterService;
	
	@PostMapping(value = ApiEndpoints.FINANCEDATA)
	public ResponseEntity<String> addFinanceData(@RequestBody FinanceMaster financeMaster){
		
		System.out.println("In Finance Controller : "+financeMaster);
		
	 	FinanceMaster fmaster = financeMasterService.addFinanceData(financeMaster);
	
		if(fmaster.getFid()>0) {
			return ResponseEntity.ok("Finance Data Added Successfully...!").status(HttpStatus.CREATED).build();
		}
		return  ResponseEntity.ok("Finance Data Not Added Successfully...!");
	}
	
	@GetMapping(value = ApiEndpoints.FINANCEALLDATA)
	public ResponseEntity<List<FinanceMaster>> getAllFinanceData(){
		  
		List<FinanceMaster> flist = financeMasterService.getAllFinanceData();
	
		return ResponseEntity.ok().body(flist);
		
		
	}
	
}
