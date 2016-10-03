package com.bayviewglen.nqueens;

import java.util.Scanner;
import java.util.Stack;

public class NQueens {

	private static Scanner scanner = new Scanner(System.in);// scanner
	private static Stack<Queen> stack = new Stack<Queen>(); // main queen stack
	private static int n; // user input

	public static void main(String[] args) { //solves the problem.

		System.out.println("Input a number: ");
		n = Integer.parseInt(scanner.nextLine());
		int size = 0;
		int height = 0;

		while (size < n) { // solves.

			Queen temp = new Queen(size, height);

			if (conflict(temp)) { // if there is a conflict check next row.
				height++; 
			}
			else if (height >= n) { // backtrack
				if (!stack.isEmpty()) {
					temp = stack.pop();
					size--;
					height = temp.getCol() + 1;
				} else {
					System.out.println("No solution");
					System.exit(-1);
				} 
			} else { // adds size and new queen starts from beginning + pushes current.
				size++;
				height = 0;
				stack.push(temp);
			}

		}

		if (size == n) { //displays
			board();
		}

	}

	private static void board() {

		final int DEFAULT = 1;
		final int ALTER = 2;

		int[][] board = new int[n][n]; // the 2d array.

		for (int i = 0; i < n; i++) {
			for (int k = 0; k < n; k++) { // sets a default to the array
				board[i][k] = DEFAULT;
			}
		}

		int size = stack.size();

		for (int i = 0; i < size; i++) { // gets the top queen from the stack
											// and its x,y then alters default.
			Queen queen = stack.pop();
			board[queen.getRow()][queen.getCol()] = ALTER;
		}

		for (int i = 0; i < n; i++) { // if not default add "Q" if default add
										// -.
			for (int k = 0; k < n; k++) {
				if (board[i][k] == ALTER) {
					System.out.print("Q ");
				} else {
					System.out.print("- ");
				}
			}
			System.out.println();
		}

	}


	private static boolean conflict(Queen a) { 
	// finds conflict and returns true if present. Empties and Refills stack.
		Stack<Queen> temp = new Stack<Queen>();
		Queen check = new Queen();
		while (!stack.isEmpty()) {
			check = stack.pop();
			temp.push(check);
			if (a.getCol() == check.getCol() || a.getRow() == check.getRow()
					|| Math.abs((double) (a.getCol() - check.getCol()) / (double) (a.getRow() - check.getRow())) == 1) {

				while (!temp.isEmpty()) {
					stack.push(temp.pop());
				}
				return true;
			}

		}

		while (!temp.isEmpty()) {
			stack.push(temp.pop());
		}
		return false;

	}

}
