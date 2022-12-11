package com.extreme.finance.service;

import java.util.List;

import com.extreme.finance.model.Role;

public  interface RoleService {

	void addRole(Role role);
	
	List<Role> getAllRole();
}
