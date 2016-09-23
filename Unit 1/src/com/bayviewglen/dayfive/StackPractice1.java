package com.bayviewglen.dayfive;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.ListIterator; 
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Stack;

public class StackPractice1 {

	static Stack<String> stack = new Stack<String>();
	static ArrayList<String> opensNCloses = new ArrayList<String>();
	final static String CLOSED = "/";
	static int ultcount;
	// works only if you have a spaces between each token or enter (how .next works)
	// doesn't work if you have an extra closed format.

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
		for (String x : opensNCloses) {
			System.out.println(x);
		}
	}

	public static void pushPop() {

		int count = 0;

		for (int i = 0; i < opensNCloses.size(); i++) {

		
			if (opensNCloses.get(i).contains(CLOSED)) {
				stack.pop();
				count--;
			}

			else if (!opensNCloses.get(i).contains(CLOSED)) {
				stack.push(opensNCloses.get(i));
				count++;
			}

		}

		if (stack.empty() && ultcount == 0) {
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
