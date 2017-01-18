package com.bayviewglen.assignment;

public class Flower {
	
	private int height;
	private int bloom;
	private int wilt;
	
	public Flower (int height, int bloom, int wilt){
		this.setHeight(height);
		this.setBloom(bloom);
		this.setWilt(wilt);
	}

	public int getWilt() {
		return wilt;
	}

	public void setWilt(int wilt) {
		this.wilt = wilt;
	}

	public int getBloom() {
		return bloom;
	}

	public void setBloom(int bloom) {
		this.bloom = bloom; 
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
