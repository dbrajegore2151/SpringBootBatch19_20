package com.extreme.finance.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.extreme.finance.model.Buy;
import com.extreme.finance.repo.BuyDataRepository;
import com.extreme.finance.service.BuyDataService;

@Service
public class BuyDataServiceImpl implements BuyDataService {

	@Autowired
	private BuyDataRepository buyDataRepo;
	
	@Override
	public List<Buy> getBuyData() {
		// TODO Auto-generated method stub
		return buyDataRepo.findAll();
	}

}
