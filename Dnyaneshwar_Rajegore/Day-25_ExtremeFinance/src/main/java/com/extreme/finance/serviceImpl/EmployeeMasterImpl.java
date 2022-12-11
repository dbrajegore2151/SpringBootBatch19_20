package com.extreme.finance.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.extreme.finance.model.EmployeeMaster;
import com.extreme.finance.repo.EmployeeMasterRepository;
import com.extreme.finance.service.EmployeeMasterService;

@Service
public class EmployeeMasterImpl implements EmployeeMasterService {
	
@Autowired
private EmployeeMasterRepository employeeMasterRepo;

	@Override
	public EmployeeMaster deleteEmpMaster(int id) {
		
		System.out.println("In Service Layer : "+id);
		EmployeeMaster employeeMaster = new EmployeeMaster();
		
		employeeMasterRepo.findById(id);
		
		if(id!=0) {
	    
	     
	     employeeMasterRepo.deleteById(id);
	  
	     System.out.println("Employee Delete Successfully...!");
		}else {
			System.out.println("Employee Not found .......!");
		}
		
		// TODO Auto-generated method stub
		return employeeMaster;
	}

	@Override
	public EmployeeMaster upDateEmpMaster(EmployeeMaster employeeMaster) {
		// TODO Auto-generated method stub
	
			
			EmployeeMaster employeeMaster2 = employeeMasterRepo.save(employeeMaster);
			
			return employeeMaster;
		
	}



}
