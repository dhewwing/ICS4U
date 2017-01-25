package com.bayviewglen.assignment;

import java.util.Scanner;

public class ZigZagSequence {

	private static int[] initial = {10, 22, 9, 33, 49, 50, 31, 60, 12, 34, 43, 57, 12, 7, 32, 889, 2, 126, 126, 26};

	private static boolean zigZaggy(int a, int b) {
		
		/* This method creates a boolean statement to check
		 * if the int after the current int is a zig-zag. 
		 * Returns false if not zig-zag and returns true
		 * if it is zig-zag.
		 * */
		
		if (a > 0 && b < 0 || a < 0 && b > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {

		/* The first statement checks for the exception, 
		 * difference between current int and next int is 
		 * 0. If this is the case you must directly add the 
		 * difference (0) to truth table. The rest is adding 
		 * current solution to the truth table if zig-zaggy and 
		 * if not zig zaggy passing through the loop.
		 * The last index is the solution.
		 */
		
		int size = initial.length;
		
		// first row stores the length, and the second row stores the last difference.
		// array to store the solutions.
		int sol[][] = new int[size][2];
		
		//put solution of 1, when the length of the sequence is 1.
		for (int i = 0; i < size; i++){
			sol[i][0] = 1;
		}
		
		for (int i = 1; i < size; i++) {
			
			for (int j = 0; j < i; j++) {
				
				int difference = initial[i] - initial[j];
				
				if(sol[j][1] == 0){
					sol[i][0] += 1;
					sol[i][1] = difference;
				}
				else{
					if (zigZaggy(sol[j][1],difference) && sol[j][0]+1>sol[i][0])
					{
						sol[i][0] = sol[j][0]+1;
						sol[i][1] = difference;
					}
				}
			}
		}
		System.out.println(sol[size-1][0]);

	}

}
