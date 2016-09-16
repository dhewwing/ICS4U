package com.bayviewglen.dayfour;

public class Person {
	
	private String lName;
	private String iName;
	
	//complete the class by adding appropriate constructers, get ,set methods, etc.
	
	public Person(String firstName,String lastName) {
		iName = firstName;
		lName = lastName;
	}
	
	public String getIName(String iName){
		return iName;
	}
	
	public void setIName(String iName){
		this.iName = iName;
	}
	
	public void setLName(String lName){
		this.lName = lName;
	}
	
	public String getLName(String lName){
		return lName;
	}
	
	public String getlName(String lName) {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

}
