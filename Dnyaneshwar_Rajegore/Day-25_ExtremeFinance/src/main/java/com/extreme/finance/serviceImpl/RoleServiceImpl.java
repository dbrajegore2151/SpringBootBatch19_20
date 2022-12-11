package com.extreme.finance.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.extreme.finance.model.Role;
import com.extreme.finance.repo.RoleRepository;
import com.extreme.finance.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleRepository roleRepository;
	
	@Override
	public void addRole(Role role) {
		// TODO Auto-generated method stub
		System.out.println("In role service : "+role);
		roleRepository.save(role);
		
	}

	@Override
	public List<Role> getAllRole() {
		// TODO Auto-generated method stub
		return roleRepository.findAll();
	}

}
