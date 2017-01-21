package com.interviewbit.arraysandstrings;

public class PalindromeString {

	public static int isPalindrome(String a) {
		 if(a == null || a.length() <= 0 ) {
				return 0;
			}
			a = a.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

		 int n = a.length();
		 
		  for (int i = 0; i < (n/2); i++) {
			  System.out.println(i + " : " + n/2);
			  System.out.println(a.charAt(i) + " : " + a.charAt(n-i-1));
			  if (a.charAt(i) != a.charAt(n - i - 1)) {
		         return 0;
		     }
		  }

		  return 1;
/*
 * 
 * less efficient algo
 * 
 * 
	    if(a == null || a.length() <= 0 ) {
			return 0;
		}
	    String original = a;
		original = original.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		String reverse = "" ;
		for(int  i = original.length() - 1 ; i >= 0 ; i--) {
			reverse = reverse + original.charAt(i);
		}
		if(original.equals(reverse)) {
			return 1;
		}
		else {
			return 0;
		}
		*/
 	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Stringnirts";
		System.out.println(isPalindrome(a));
	}

}
