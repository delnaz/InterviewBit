package com.interviewbit.bitmanipulationandrecursion;

public class NumberOfBits {
	 public static int numSetBits(long a) {
	        int count = 0;
	        while(a > 0){
	            if(a % 2 == 1)
	                count++;
	            
	            a = a/2;
	        }
	        return count;
	    }
	    public static void main(String[] args){
	        long a = 83;
	        System.out.println(numSetBits(a));
	    }
}
