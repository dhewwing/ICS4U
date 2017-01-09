package com.bayviewglen.dayfive;

import java.util.Stack;

public class BalancedBracket {

	public static boolean isParenthesisMatch(String str) {
	    if (str.charAt(0) == '{')
	        return false;

	    Stack<Character> stack = new Stack<Character>();

	    char c;
	    for(int i=0; i < str.length(); i++) {
	        c = str.charAt(i);
	        System.out.println(stack);
	        if(c == '(')
	            stack.push(c);
	        else if(c == '{')
	            stack.push(c);
	        else if(c == ')')
	            if(stack.empty())
	                return false;
	            else if(stack.peek() == '(')
	                stack.pop();
	            else
	                return false;
	        else if(c == '}')
	            if(stack.empty())
	                return false;
	            else if(stack.peek() == '{')
	                stack.pop();
	            else
	                return false;
	    }
	    return stack.empty();
	}
	public static void main(String[] args) {
		String str = "({})";
		if (isParenthesisMatch(str)){
			System.out.println("valid");
		}
		else{
			System.out.println("not valid");
		}
	}
	
	
}
