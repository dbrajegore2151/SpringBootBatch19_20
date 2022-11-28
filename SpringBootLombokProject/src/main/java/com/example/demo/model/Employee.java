package com.example.demo.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Setter
//@Getter
//@ToString
//@AllArgsConstructor(access = AccessLevel.PUBLIC)
//@NoArgsConstructor
@Data
//@Builder
public class Employee {

	private int eid;

	private String ename;

	private String aaddress;

	/**
	 * @return the eid
	 */
	/*
	 * public int getEid() { return eid; }
	 * 
	 *//**
		 * @param eid the eid to set
		 */
	/*
	 * public void setEid(int eid) { this.eid = eid; }
	 * 
	 *//**
		 * @return the ename
		 */
	/*
	 * public String getEname() { return ename; }
	 * 
	 *//**
		 * @param ename the ename to set
		 */
	/*
	 * public void setEname(String ename) { this.ename = ename; }
	 * 
	 *//**
		 * @return the aaddress
		 */
	/*
	 * public String getAaddress() { return aaddress; }
	 * 
	 *//**
		 * @param aaddress the aaddress to set
		 *//*
			 * public void setAaddress(String aaddress) { this.aaddress = aaddress; }
			 * 
			 * @Override public String toString() { return "Employee [eid=" + eid +
			 * ", ename=" + ename + ", aaddress=" + aaddress + "]"; }
			 */

}
