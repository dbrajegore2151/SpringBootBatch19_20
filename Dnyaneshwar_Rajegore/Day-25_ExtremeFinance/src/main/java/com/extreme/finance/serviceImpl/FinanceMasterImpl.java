package com.extreme.finance.serviceImpl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.extreme.finance.model.FinanceMaster;
import com.extreme.finance.repo.FinanceRepository;
import com.extreme.finance.service.FinanceMasterService;

@Service
public class FinanceMasterImpl implements FinanceMasterService {

	@Autowired
	private FinanceRepository financeMasterepo;
	
	@Override
	public FinanceMaster addFinanceData(FinanceMaster financeMaster) {
		// TODO Auto-generated method stub
		System.out.println("In Finance Service FinanceMaster ---->"+financeMaster);
		LocalDateTime date = LocalDateTime.now();
		
		financeMaster.setFdate(date);
		FinanceMaster financeMaster2 = financeMasterepo.save(financeMaster);
	
		return financeMaster2;
	}

	@Override
	public List<FinanceMaster> getAllFinanceData() {
		// TODO Auto-generated method stub
		
		return financeMasterepo.findAll();
	}

}
