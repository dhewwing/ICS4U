package com.bayviewglen.contactlist;

public class Contact {

	private String phone;
	private String first;
	private String last;
	
	public Contact(String p, String f, String l){
		
		phone = p;
		setFirst(f);
		last = l;
		
		
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}
	
	
	
	
}
