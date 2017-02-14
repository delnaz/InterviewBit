package com.interviewbit.bitmanipulationandrecursion;

public class ReverseBits {

	  public static long reverse(long a) {
		  long result = 0;
		  
	        for(int  i = 0; i < 32; i++) {
			  result <<= 1;
			  result |= (a&1);
			  a >>= 1;
		  }
	        return result;
	    }
	    public static void main(String[] args){
	        long a = 4;
	        System.out.println(reverse(a));
	    }
}
