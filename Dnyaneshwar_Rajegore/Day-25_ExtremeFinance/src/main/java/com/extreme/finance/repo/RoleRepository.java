package com.extreme.finance.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.extreme.finance.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer>{

}
