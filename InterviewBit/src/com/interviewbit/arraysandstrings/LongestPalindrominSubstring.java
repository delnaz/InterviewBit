package com.interviewbit.arraysandstrings;

public class LongestPalindrominSubstring {

public static String longestPalindrome(String a) {
	
	//public String longestPalindrome(String a) {
	    if(a == null) return null;
	    if(a.length() == 1) return a;
	    String longest = "";
	    longest = a.substring(0,1);
	    for(int i = 0; i< a.length() ;i++) {
	        String tmp = helper(a,i,i);
	        if(tmp.length() > longest.length()) {
	            longest = tmp;
	        }
	        tmp = helper(a,i,i+1);
	        if(tmp.length() > longest.length()) {
	            longest = tmp;
	        }
	    }
	    return longest;
	}
	public static String helper(String a, int start, int end) {
	    while(start >= 0 && end <= a.length() - 1 && a.charAt(start) == a.charAt(end)) {
	        start--;
	        end++;
	    }
	    return a.substring(start + 1, end);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestPalindrome("abbcddcbbabdccdb"));
	}

}
