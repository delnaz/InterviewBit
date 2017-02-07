package com.interviewbit.treesandbinarysearch;

import java.math.BigInteger;

public class PowerFunction {

	public static void main(String[] args) {
		int x = 79161127;
		int n = 99046373;
		int d = 57263970;
		System.out.println(calculate(x,n,d));
	}

	private static int calculate(int x, int n, int d) {
		 if(x > d) {
			 x = x % d;
		 }
		 long val = power(x,n,d);
		    long result ;
		    result = val;
		    if(result < 0) {
		        return (int)(result + d) % d;
		    }
		    return (int)result;
	}

	private static long power(int x, int n, int d) {
		   if(x == 0) {
		   return 0;
		   }
		   if(n == 0) {
		   return 1;
		   }
		   long val = 1;
		   long x1 = x%d;
		   
		   while(n > 0) {
		       if(n%2 != 0){
		           val = val * x1;
		           val = val % d;
		       }
		       n/=2;
		       x1 = x1 * x1;
		       x1 = x1 % d;
		   }
		   
		   return val;

		}

}
