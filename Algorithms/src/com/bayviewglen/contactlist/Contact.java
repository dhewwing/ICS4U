package com.bayviewglen.contactlist;

// contact class.
public class Contact implements Comparable {

	String name;
	String phone;
	
	public Contact(String name){
		this(name, null);
	}
	public Contact(String name, String phone){
		this.name = name;
		this.phone = phone;
	}

	public void setPhone(String newphone){
		phone = newphone;
	}
	
	public String getPhone(){
		return phone;
	}
	
	public void setName (String newname){
		name = newname;
	}
	
	public String getName(){
		return name;
	}
	
	public int compareTo(Object contact1){
		Contact temp = (Contact) contact1;
		return (name.compareToIgnoreCase(temp.name));
	}
	
	public String toString(){
		return name + "-----" + phone;
	}
}
