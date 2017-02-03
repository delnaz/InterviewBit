package com.interviewbit.treesandbinarysearch;

import java.util.ArrayList;

public class MatrixSearch {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		ArrayList<Integer> a3 = new ArrayList<Integer>();
		a1.add(1);
		a1.add(3);
		a1.add(5);
		a1.add(7);
		a2.add(10);
		a2.add(11);
		a2.add(16);
		a2.add(20);
		a3.add(23);
		a3.add(30);
		a3.add(34);
		a3.add(50);
		a.add(a1);
		a.add(a2);
		a.add(a3);
		System.out.println(matrixSearch(a, 6));

	}

	private static int matrixSearch(ArrayList<ArrayList<Integer>> a, int b) {
		int rows = a.size();
		int cols = a.get(0).size();
		int left = 0;
		int right = rows * cols - 1;
		
		while(left <= right) {
			int mid = (left + right) /2;
			int i = mid /cols;
			int j = mid % cols;
			int midVal = a.get(i).get(j);
			if(midVal == b) {
				return 1;
			} else if (midVal < b ){
				left = mid + 1;
			} else if(midVal > b ){
				right = mid - 1;
			}
		}
		return 0;
	}

}
