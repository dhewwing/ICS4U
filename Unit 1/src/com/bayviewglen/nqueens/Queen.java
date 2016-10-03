package com.bayviewglen.nqueens;

public class Queen {
	
	private int row;
	private int col;
	
	public Queen() {
	}
	
	public Queen(int x, int y) {
		row = x;
		col = y;
	}
	
	public int getRow() {
		return row;
	}
	
	public int getCol() {
		return col;
	}
	
	public void setRow(int x) {
		row = x;
	}
	
	public void setCol(int y) {
		col = y;		
	}
}