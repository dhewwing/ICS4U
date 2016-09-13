package com.bayviewglen.daytwo;

public class Contact {
	
	private String lName;
	private String iName;
	private String phone;
	
	//complete the class by adding appropriate constructers, get ,set methods, etc.
	
	public Contact(String firstName,String lastName, String phoneNum) {
		iName = firstName;
		lName = lastName;
		phone = phoneNum;
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
	
	public String getPhone(String phone){
		return phone;
	}
	
	public void setPhone(String phone){
		this.phone = phone;
	}

	public static void main(String[] args) {

	}

	public String getlName(String lName) {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

}
