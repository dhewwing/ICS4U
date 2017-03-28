package com.bayviewglen.contactlist;

public interface Directory {
	
	//Returns the data if the data is present.
	public Object search(Comparable item);

	 // Adds an item to a directory if not already present.	 
	public void insert(Comparable item);
	
	 // Deletes an item from the directory.
	 public Comparable delete(Comparable item);
	
	 // Prints all the data to the stream.
	public void printAll(Node node);
}
