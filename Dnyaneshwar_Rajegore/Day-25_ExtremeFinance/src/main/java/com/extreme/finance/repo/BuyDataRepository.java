package com.extreme.finance.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.extreme.finance.model.Buy;

@Repository
public interface BuyDataRepository extends JpaRepository<Buy, Integer>{

}
