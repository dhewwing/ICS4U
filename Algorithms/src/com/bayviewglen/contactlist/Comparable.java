package com.bayviewglen.contactlist;

public abstract interface Comparable {

	 /*
     * Returns a value < 0 if this object is less than object o
     * Returns a value > 0 if this object is greater than object o
     * Returns 0 if this object is equal to object o
     */
	
	public int compareTo (Object obj);
}