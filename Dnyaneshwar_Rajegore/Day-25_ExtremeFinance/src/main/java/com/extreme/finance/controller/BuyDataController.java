package com.extreme.finance.controller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.extreme.finance.model.Buy;
import com.extreme.finance.service.BuyDataService;
import com.extreme.finance.util.ExcelGenerator;

@RestController
public class BuyDataController {

	@Autowired
	private BuyDataService buyDataService;
	
	@GetMapping(value = "download/buy.xlsx")
	public ResponseEntity<InputStreamResource> excelBuyBataReport() throws IOException{
		
		List<Buy> blist = buyDataService.getBuyData();
		
		ByteArrayInputStream in = ExcelGenerator.excelGenerating(blist);
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("Content -Disposition","attachment;filename-Buy.xlsx");
		
		return ResponseEntity
				.ok()
				.headers(headers)
				.body(new InputStreamResource(in));
				
		
	}
}
