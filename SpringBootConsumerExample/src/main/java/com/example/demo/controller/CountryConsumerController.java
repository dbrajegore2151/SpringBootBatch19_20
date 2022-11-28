package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.State;

@RestController
public class CountryConsumerController {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping(value = "/get")
	public Map<String, List<State>> getCountryData(){
		
	  Map<String, List<State>> map = restTemplate.getForObject("http://localhost:9000/getCountryData", Map.class);
	  
	  return map;
	}
	
	@GetMapping(value = "/get1")
	public Map<String, List<State>> getCountData(){
	  ResponseEntity<Map> map = restTemplate.getForEntity("http://localhost:9000/getCountryData", Map.class);
	  System.out.println(map.getBody());
	  return map.getBody();
	}
}
