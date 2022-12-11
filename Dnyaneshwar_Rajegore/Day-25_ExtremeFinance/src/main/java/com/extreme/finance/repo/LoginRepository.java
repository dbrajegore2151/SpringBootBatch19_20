package com.extreme.finance.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.extreme.finance.model.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, Integer>{

	Login findByUnameAndPass(String uname, String pass);
}
