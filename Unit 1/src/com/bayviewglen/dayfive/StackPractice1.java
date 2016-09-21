package com.bayviewglen.dayfive;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Stack;


public class StackPractice1 {

	public void fromFile() {
        try {
               Scanner fileScan = new Scanner(new File("data/stackFile.dat"));
               String[] opens, closes;
               while (true) {
                      try {
                            if(fileScan.) = fileScan.nextLine();
                            lname = fileScan.nextLine();
                            phone = fileScan.nextLine();
                      } catch (NoSuchElementException e) {
                            break;
                      }
                      
               }
        } catch (FileNotFoundException e) {
               e.printStackTrace();
        }
  }

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
	}

}
