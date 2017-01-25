package com.bayviewglen.assignment;

public class BadNeighbours {

	private static int[] donations = {10, 3, 2, 5, 7, 9}; // return 19.
	
	public static int max(int[] arr){ //finds max.
		
		/* This method finds the max in arrays created by the solution method.
		 * There are four cases you must test four. One person, two persons,
		 * 3 persons, 4 or more persons. I test 1,2 and 3 persons because 
		 * it is the only 3 cases that allows for direct cases. Meaning,
		 * that you can compare two things, and compare added two things 
		 * the lonely element.  Beyond this, I made a temporary array 
		 * where you store the elements, add them with the donations array
		 * then stores the newest solution in the temporary array. At the
		 * end of the loop the last index will be the max. 
		 */
		
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
		
		/* Since the last index and the first index are neighbors 
		 * they cannot be added. Therefore, the best solution is
		 * to have two array, one with the first index --> second-last
		 * index and another with second index --> last index. This 
		 * will create two arrays that will be able to test all 
		 * possible then will find the max value using "max" method. 
		 */		
		
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
		for (int k = 0; k < arr1.length; k++){
			System.out.println(" array 1: " +arr1[k]);
		}
		System.out.println();
		for (int j = 0; j < arr2.length; j++){
			System.out.println(" array 2: " + arr2[j]);
		}
		return Math.max(max(arr1), max(arr2));
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("The maximum amount of donations $" + solution(donations));
		
	}

}