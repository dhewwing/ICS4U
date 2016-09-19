package com.bayviewglen.dayfour;

public class Person  {
	
	private String lName;
	private String iName;
	private String phone;
	
	//complete the class by adding appropriate constructers, get ,set methods, etc.
	
	public Person(String firstName,String lastName, String phoneNum) {
		iName = firstName;
		lName = lastName;
		phone = phoneNum;
	}
	
	public String getIName(){
		return iName;
	}
	
	public void setIName(String iName){
		this.iName = iName;
	}
	
	public void setLName(String lName){
		this.lName = lName;
	}
	
	public String getLName(){
		return lName;
	}
	
	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String toString(){
		String  x = iName + " " + lName + " " + phone;
		return x;
	}

}
