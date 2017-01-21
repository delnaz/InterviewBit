package com.interviewbit.arraysandstrings;

import java.util.ArrayList;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("addbcddac");
		a.add("addbchij");
		a.add("adbcdsfe");
		System.out.println(longestCommonPrefix(a));
	}

	public static String longestCommonPrefix(ArrayList<String> a) {
	    if(a == null || a.isEmpty()) {
	    	return null;
	    }
	    String prefix  = a.get(0);
	    for(int  i = 1 ; i < a.size(); i++) {
	        while(a.get(i).indexOf(prefix) != 0 ) {
	            prefix = prefix.substring(0,prefix.length() - 1);
	            if(prefix.isEmpty()) {
	            	return "";
	            }
	        }
	    }
	    return prefix;
	}

}
