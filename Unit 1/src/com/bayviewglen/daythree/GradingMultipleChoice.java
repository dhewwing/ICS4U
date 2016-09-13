package com.bayviewglen.daythree;

public class GradingMultipleChoice {

	final static String[] answers = {"D", "B", "D", "C", "C", "D", "A", "E", "A", "D" };

	public static void main(String[] args) {
		
		String studentAnswers[][] = new String [][] {
			
			{"D", "B", "D", "C", "C", "D", "A", "E", "A", "D"},
			{"D", "B", "D", "A", "C", "D", "A", "E", "B", "C"}
			
			
		};
		
		for (int i = 0; i < studentAnswers.length; i++){
			
			int count = 0;
			
			System.out.println("This is Student " + i);
			
			for (int j = 0; j < studentAnswers[i].length; j++){
				
				if(studentAnswers[i][j].equals(answers[j]))
					count++;
				
			}
			
			System.out.println("Student " + i + " has gotten " + count + " correct answers.");
			
		}
			
		
	}

}
