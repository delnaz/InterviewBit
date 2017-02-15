package com.interviewbit.bitmanipulationandrecursion;

public class SingleNumberII {

	public static void main(String[] args) {
		int[] a = {1,3,1,1,2,2,45,2,3,4,3,4,4};
		compute(a);
	}

	private static void compute(int[] a){
		int one = 0;
		int two = 0;
		int three = 0;
		for(int i =0 ; i < a.length; i++) {
			System.out.println("one  ::"+ (one&a[i]));
			two = two | one & a[i];
			one = one ^ a[i];
			three = one & two;
			one = one & ~three;
			two = two & ~three;
		}
		System.out.println(one);
	}
}
