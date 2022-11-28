package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.State;

@RestController
public class CountryController {

	@GetMapping(value = "/getCountryData")
	public Map<String, List<State>> getdata(){
		
		Map<String, List<State>> map = new HashMap<String, List<State>>();
		List<State> slist = new ArrayList<State>();
		
		State state = new State();
		state.setSid(12);state.setSname("Maharashtra");
		
		State state1 = new State();
		state1.setSid(11);state1.setSname("Delhi");
		
		slist.add(state);slist.add(state1);
		
		map.put("MH", slist);
		
		return map;
		
	}
	
}
