package com.interviewbit.arraysandstrings;

import java.util.ArrayList;
import java.util.Stack;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "The boy jumps  off the wall";
		reverseString (s);
	}

	private static void reverseString(String s) {
		
		ArrayList<String> res = new ArrayList<String>();
		String after = s.trim().replaceAll(" +", " ");
		String[] st = after.split(" " );
		for(int i = 0; i < st.length; i++) {
			res.add(0,st[i]);
		}
		System.out.println(res);
		String resu = String.join(" ",res);
		System.out.println(resu);
		
		
	/*	String[] st = s.split(" " );
		Stack<String> stack = new Stack<String>();
		for(int i = 0; i < st.length; i++) {
			stack.push(st[i]);
			System.out.println(stack);
		}
		System.out.println(stack.size());
		for(int i = stack.size() ;i > 0 ;i--) {
			
			System.out.println(stack.peek());
			stack.pop();
		}*/
	}

}
