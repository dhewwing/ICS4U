package com.bayviewglen.dayfive;

import java.util.Stack;

public class BalancedEquation {

	//works with only with "number - number - operator" but not with "number - operator - number" 
	//not 4+4 but works with 4 4 +.
	
	public static boolean isBalanced(String str){
	
		Stack<Character> stack = new Stack<Character>();
		char c;
		
		for (int i = 0; i < str.length(); i++){
			
			c = str.charAt(i);
			
			if(c == '+' || c == '-' || c == '*' || c == '/'){
				System.out.println("popped");
				if (stack.isEmpty()){
					return false;
				}else{
					stack.pop();
					stack.pop();
				}
			}
			else if(c == ' '){
				System.out.println("skipped");
				continue;
			}
			else{
				while(true){
					i++;
					if(str.substring(i,i+1).equals(" ")){
						break;
					}
				}
				System.out.println("pushed");
				stack.push(c);

			}
			
		}
		return stack.isEmpty();
	}
	public static void main(String[] args){
		
		String str ="4 4 + 5 5 - 54 5 -";
		if(isBalanced(str)){
			System.out.println("");
			System.out.println("valid");
		}else
			System.out.println("invalid");
		
	}

}

