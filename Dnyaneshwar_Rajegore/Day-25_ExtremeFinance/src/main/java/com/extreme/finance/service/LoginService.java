package com.extreme.finance.service;

import com.extreme.finance.dto.EmployeeMasterDto;
import com.extreme.finance.model.Login;

public interface LoginService {

	void addLoginDataWithEmployee(Login login);
	
	EmployeeMasterDto getLoginData(String uname,String pass);
}
