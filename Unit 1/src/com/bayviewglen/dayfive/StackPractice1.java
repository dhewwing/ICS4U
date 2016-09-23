package com.bayviewglen.dayfive;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Stack;

public class StackPractice1 {

	static Stack<String> stack = new Stack<String>();
	static ArrayList<String> opensNCloses = new ArrayList<String>();
	final static String CLOSED = "/";
	
	// works only with the file with every line is a value. 
	
	public static void addFromFile() {
	        try {
	               Scanner fileScan = new Scanner(new File("data/stackFile.dat"));
	               
	               while (fileScan.hasNext()) {
	                      try {
	                            opensNCloses.add(fileScan.next());
	                      } catch (NoSuchElementException e) {
	                            break;
	                      }
	                      
	               }
	        } catch (FileNotFoundException e) {
	               e.printStackTrace();
	        }
	        for (String x : opensNCloses){
	        	System.out.println(x);
	        }
	        }

	public static void pushPop() {

		for (int i = 0; i < opensNCloses.size(); i++) { 
			
			if (opensNCloses.get(i).contains(CLOSED)) {
				stack.pop();
			}

			else if (!opensNCloses.get(i).contains(CLOSED)) {
				stack.push(opensNCloses.get(i));
			}

			
		}

		if (stack.empty()) {
			System.out.println("The format is correct");
		} else {
			System.out.println("Format is wrong");
		}

	}

	public static void main(String[] args) {
		
		addFromFile();
		pushPop();
		for (String x : opensNCloses) {
			System.out.println(x);
		}
	}

}
