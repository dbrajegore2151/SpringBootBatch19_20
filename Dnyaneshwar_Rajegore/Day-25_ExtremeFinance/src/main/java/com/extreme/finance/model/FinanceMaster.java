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
public class FinanceMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int fid;

	private String fname;
	
	private String fdata;
	
	private double frate;
	
	private String fcompanyname;
	 
	private LocalDateTime fdate;
	
	private LocalDateTime updatedate;

	private double ammount;
}
