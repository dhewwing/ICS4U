package com.bayviewglen.assignment;

public class BadNeighbours {

	private static int[] donations = {10, 3, 2, 5, 7, 9}; // return 19.
	
	public static int max(int[] arr){ //finds max.
		
		// one person
		if(arr.length == 1){
			return arr[0];
		}
		// if only two neighbors. 
		if (arr.length == 2){
			int x = (arr[0] > arr[1]) ?  arr[0] : arr[1];
			return x;
		}
		// three neighbors
		if(arr.length == 3){
			int x = Math.max(arr[0] + arr[2], arr[1]);
			return x;
		}
		// all other cases
		int[] x= new int[arr.length];
		x[0] = arr[0];
		x[1] = (arr[0] > arr[1]) ? arr[0] : arr[1];
		x[2] = Math.max(arr[0] + arr[2], arr[1]);
		
		for (int i = 3; i < arr.length; i++){
			x[i] = Math.max(arr[i] + x[i-2], arr[i-1] + x[i-3]);
		}
		
		return x[arr.length-1];
	}
	
	public static int solution(int[] arr){
		
		int[] arr1 = new int[arr.length];
		int[] arr2 = new int[arr.length];
		int length = donations.length;
		
		for(int i = 0; i < length; i++){
			if (i == 0){
				arr1[0] = donations[i];
			}else if(i == length-1){
				arr2[0] = donations[i];
			}else{
				arr1[i] = donations[i];
				arr2[i] = donations[i];
			}
		}
		return Math.max(max(arr1), max(arr2));
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("The maximum amount of donations $" + solution(donations));
		
	}

}