package com.extreme.finance.serviceImpl;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.extreme.finance.dto.EmployeeMasterDto;
import com.extreme.finance.model.Login;
import com.extreme.finance.repo.LoginRepository;
import com.extreme.finance.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	private LoginRepository loginRepository;
	
	@Override
	public void addLoginDataWithEmployee(Login login) {
		// TODO Auto-generated method stub
		System.out.println("In service layer : "+ login);
		
		 LocalDateTime dateOfJoin = LocalDateTime.now();
		login.getEmployeeMaster().setDateofjoin(dateOfJoin);
		
		loginRepository.save(login);
	}

	@Override
	public EmployeeMasterDto getLoginData(String uname, String pass) {
		// TODO Auto-generated method stub
		System.out.println("In service layer : "+ uname +" "+pass);
		EmployeeMasterDto employeeMasterDto = new EmployeeMasterDto();
		Login login = loginRepository.findByUnameAndPass(uname, pass);
	
		if(login!=null) {
			employeeMasterDto.setEmpid(login.getEmployeeMaster().getEmpmasterid());
			employeeMasterDto.setName(login.getEmployeeMaster().getEmpname());
			employeeMasterDto.setUname(login.getUname());
			employeeMasterDto.setRolename(login.getEmployeeMaster().getRole().getRolename());
			
		}else {
			employeeMasterDto.setErrorMsg("Imployee Credentials.....!");
		}
		
		System.out.println(employeeMasterDto);
		
		return employeeMasterDto;
	}

}
