package com.bayviewglen.dayfive;

import java.util.Stack;

public class PreFixEvaluator {

	public static boolean isBalanced (String str){
		Stack<Character> stack = new Stack<Character>();
		char c; 
		for(int i = 0; i<str.length(); i++){
			c = str.charAt(i);
			if (c == '+' || c == '-' || c == '*' || c == '/'){
				System.out.println("pushed operator");
				stack.push(c);
			}else if(c == ' '){
				System.out.println("skipped");
				continue;
			}else{
				if (stack.isEmpty()){
					return false;
				}else{
					System.out.println("popped operator");
					stack.pop();
					stack.pop();
				}
					
				}
			}
		return stack.isEmpty();
	}
	
	public static void main (String[] args){
		
		String str = "+ 4 ";
		
		if (isBalanced(str)){
			System.out.println("valid");
		}else{
			System.out.println("not valid");
		}
	}
}
