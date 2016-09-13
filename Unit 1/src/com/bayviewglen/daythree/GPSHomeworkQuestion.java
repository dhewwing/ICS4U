package com.bayviewglen.daythree;

import java.util.Scanner;
import java.lang.Math;

public class GPSHomeworkQuestion {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		 
	System.out.println("Enter the number of points you will use");
	final int numPoints = scanner.nextInt();
	
	double points[][] = new double[numPoints][2];
	double shortestDistance = 0;
	double distance = 0;
	String closest1 = "";
	String closest2 = "";
	
	// enter x and y co-ordinates
	
	for (int i = 0; i<numPoints; i++)
	{
		System.out.println("Enter the x co-ordinate for point " + i + ": ");
		points[i][0] = scanner.nextDouble();
		System.out.println("Enter the y co-ordinate for point  " + i + ": ");
		points[i][1] = scanner.nextDouble();
	}
	
	for (int i = 0; i < numPoints; i++)
	{
		for (int j = i; j < numPoints-1; j++)
		{
		double dx = points[i][0] - points[j+1][0];
		double dy = points[i][1] - points[j+1][j];
		distance = Math.sqrt(dx * dx + dy * dy);
			
		// sets the first iteration to the closest points
		
		if (i == 0 && j == 0){
		shortestDistance = distance;
		closest1 = "(" + points[0][0] + "," + points[0][1] + ")";
		closest2 = "(" + points[1][0] + "," + points[1][1] + ")";
		}
		
		//sets closer distances
		
		else if (shortestDistance < distance)
		{
				closest1 = "(" + points[i][0] + "," + points[i][1] + ")";
				closest2 = "(" + points[j+1][0] + "," + points[j+1][1] + ")";
			
		}
		}
		
	}
	
	System.out.println("The distance is: " + shortestDistance);
	System.out.println("The closest points are " + closest1 + " and " + closest2);
	System.out.println("Thank you come again!");
	
	}

}