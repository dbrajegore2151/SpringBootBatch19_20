package com.extreme.finance.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString 
@AllArgsConstructor
@NoArgsConstructor
public class Sell {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	
	private String fsellname;
	
	private LocalDateTime selldate;
	
	private String frate;
	
	private String sellrate;
	
	private String sellquantity;
	
	private String amount;
}
