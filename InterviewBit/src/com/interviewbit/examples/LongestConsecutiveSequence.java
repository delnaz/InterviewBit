package com.interviewbit.examples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 
 * @author ZED-DEV
 *
 *Given an unsorted array of integers, find the length of the longest consecutive elements sequence.

Example: 
Given [100, 4, 200, 1, 3, 2],
The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.

Your algorithm should run in O(n) complexity.
 */
public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<Integer> arr = Arrays.asList(100,4,200,1,3,22);
		List<Integer> arr = Arrays.asList();
		longestConsecutive(arr);
	}

	public static int longestConsecutive(final List<Integer> arr) {
		// TODO Auto-generated method stub
		Set<Integer> res = new HashSet<Integer>();
		if(arr.isEmpty() || arr.size() <= 0) {
			System.out.println(arr.size());
			return -1;
		}
		for(int temp : arr) {
			res.add(temp);
		//	System.out.println(res);
		}
		int maxLength = 1;
		for(int temp : arr) {
			int left = temp -1 ;
		//	System.out.println("left :: " + left);
			int right = temp + 1;
			//System.out.println("right :: " + right);

			int count = 1;
			while(res.contains(left)) {
				count++;
				res.remove(left);
				left--;
			//	System.out.println("left :: " + left);

			}
			while(res.contains(right)) {
				count++;
				res.remove(right);
				right++;
			//	System.out.println("right :: " + right);

			}
//			System.out.println("count :: maxlength :: " + count + " :: " + maxLength);
			maxLength = Math.max(count,maxLength);
		}
		System.out.println(maxLength);
		return maxLength;
	}

}
