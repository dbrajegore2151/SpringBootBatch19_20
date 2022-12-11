package com.extreme.finance.service;

import java.util.List;

import com.extreme.finance.model.FinanceMaster;

public interface FinanceMasterService {

	FinanceMaster addFinanceData(FinanceMaster financeMaster);

	List<FinanceMaster> getAllFinanceData();
	
}
