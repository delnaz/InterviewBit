package com.interviewbit.bitmanipulationandrecursion;

import java.util.ArrayList;

public class Combinations {

	public static void main(String[] args) {
		int n = 4;
		int r = 2;
		combination(n,r);
	}

	private static void combination(int n, int r) {
		 ArrayList<Integer> a = new ArrayList<Integer>();
		    for(int  i = 1 ; i <= n ;i++) {
		        a.add(i);
		    }
		int[] data = new int[r];
	    ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();

		compute(a, data, res, 0, a.size() - 1, 0, r);
		System.out.println(res);
	}

	private static void compute(ArrayList<Integer> a, int[] data, ArrayList<ArrayList<Integer>> res, int start, int end, int index, int r) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		if(index == r) {
			for(int j = 0; j < r; j++) {
				temp.add(data[j]);
				//System.out.print(data[j]);
			}
			//System.out.println("");
			//System.out.println(temp);
			res.add(temp);
			return;
		}
		
		for(int i = start; i <= end && end- i + 1 >= r - index; i++) {
			data[index] = a.get(i);
			compute(a, data, res, i + 1, end, index + 1, r);
		}
		
	}

}
