package com.interviewbit.examples;

import java.util.ArrayList;

/**
 * 
 * @author ZED-DEV
 *
 *Given an array of non negative integers A, and a range (B, C), 
find the number of continuous subsequences in the array which have sum S in the range [B, C] or B <= S <= C

Continuous subsequence is defined as all the numbers A[i], A[i + 1], .... A[j]
where 0 <= i <= j < size(A)

Example :

A : [10, 5, 1, 0, 2]
(B, C) : (6, 8)
ans = 3 
as [5, 1], [5, 1, 0], [5, 1, 0, 2] are the only 3 continuous subsequence with their sum in the range [6, 8]

 NOTE : The answer is guranteed to fit in a 32 bit signed integer. 
 */


public class NumRange {

	public static int numRange(ArrayList<Integer> A, int B, int C) {
		
		int count = 0;
		if(A.isEmpty()) {
		    return count;
		}
		for(int i=0; i< A.size(); i++){
			int sum =0;
			for(int j = i ; j < A.size(); j++) {
				sum = sum + A.get(j);
				if(sum >= B && sum <=C){
					count++;
				}
				if(sum > C) {
					break;
				}
			}
		}
		System.out.println(count);
		return count;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList<Integer> arr = new ArrayList<Integer>();
			arr.add(10);
			arr.add(5);
			arr.add(1);
			arr.add(8);
			arr.add(2);
			
			numRange(arr,6,8);
	}

}
