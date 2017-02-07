package com.interviewbit.bitmanipulationandrecursion;

public class SingleNumber {

	public static int singleNumber(int[] A) {
		int x = 0;
		for (int a : A) {
			x = x ^ a;
		}
		return x;
	}
	
	public static void main(String[] args) {
		int[] A = {1,2,2,3,1};
		System.out.println(singleNumber(A));
	}

}
