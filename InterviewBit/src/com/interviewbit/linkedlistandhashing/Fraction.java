package com.interviewbit.linkedlistandhashing;

import java.util.HashMap;

public class Fraction {

	public static void main(String[] args) {
		getFraction(2,-3);
	}

	private static String getFraction(int numerator, int denominator) {
				
		if(numerator == 0) {
	        return "0";
	    }
	    if(denominator == 0) {
	        return "";
	    }
	    
	    String result = "";
	    HashMap<Long,Integer> map = new HashMap<Long,Integer>();
	    
	   if ((numerator < 0) ^ (denominator < 0)) {   
		result += "-";
    	}
 
	    long res = Math.abs(numerator) / Math.abs(denominator);
	    result += String.valueOf(res);
	    
	    long rem = (Math.abs(numerator) % Math.abs(denominator)) * 10;
	    if(rem == 0) {
	        return result;
	    }
	    
	    while(rem != 0) {
	        if(map.containsKey(rem)) {
	            int index = map.get(rem);
	            String s1 = result.substring(0,index);
	            String s2 = result.substring(index,result.length());
	            result = s1 + "(" + s2 + ")" ;
	            return result;
	        }
	        map.put(rem,result.length());
	        res = rem / Math.abs(denominator);
	        result += String.valueOf(res);
	        rem = (rem % Math.abs(denominator)) * 10;
	    }
	    return result;
	}
}
