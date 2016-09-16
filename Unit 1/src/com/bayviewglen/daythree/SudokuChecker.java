package com.bayviewglen.daythree;

public class SudokuChecker {

	public static void main(String[] args) {
	
		int[][] grid = new int[9][9];
		
		for (int i = 0; i < grid.length; i++){
			for (int j = 0; j < grid[i].length; j++){
				grid[i][j] = 2;
			}
			System.out.println(grid);
		}
		
		

	}

}
