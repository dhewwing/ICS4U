package com.bayviewglen.assignment;

import java.util.Scanner;

public class ZigZagSequence {

	private static int[] initial = {10, 22, 9, 33, 49, 50, 31, 60, 12, 34, 43, 57, 12, 7, 32, 889, 2, 126, 126, 26};

	private static boolean zigZaggy(int a, int b) {
		if (a > 0 && b < 0 || a < 0 && b > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {

		
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
