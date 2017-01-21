package com.interviewbit.arraysandstrings;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 * @author ZED-DEV
 *
 Given a non-negative number represented as an array of digits,

add 1 to the number ( increment the number represented by the digits ).

The digits are stored such that the most significant digit is at the head of the list.

Example:

If the vector has [1, 2, 3]

the returned vector should be [1, 2, 4]

as 123 + 1 = 124.

*/
public class AddOneToNumber {
	

	public static final ArrayList<Integer> addOne(ArrayList<Integer> digits) {

		
	    int carry = 1;
	    int[] result = new int[digits.size()];
	  //  System.out.println(digits.size());
	    for (int i = digits.size() - 1; i >= 0; i--) {
	        int val = digits.get(i) + carry;
			//System.out.println(val%10);

	        result[i] = val % 10;
	        			//System.out.println(result[i]);

	        carry = val / 10;
	    }
	    if (carry == 1) {
	        result = new int[digits.size() + 1];
	        result[0] = 1;
	    }
	   // System.out.println(Arrays.asList(result.toString()));
	    ArrayList<Integer> res = new ArrayList<Integer>();
	    for(int i = 0 ; i < result.length; i++){
	    	//System.out.println(result[i]);
	    	res.add(result[i]);
	    }
	    System.out.println(res);
	    return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		plusOne(a);*//*
		int[] a = {1,2,3};*/
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(9);
		a.add(9);
		a.add(9);
		a.add(9);
		a.add(9);
		addOne(a);
	
	}

}
