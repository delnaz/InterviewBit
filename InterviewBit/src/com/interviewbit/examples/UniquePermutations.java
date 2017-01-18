package com.interviewbit.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class UniquePermutations {
	
	
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(1);
		num.add(2);
		num.add(3);
		permute(num);
		
		}

	private static void permute(ArrayList<Integer> num) {
	    ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		permute(num,0, result);
		System.out.println(result);
	}

	private static void permute(ArrayList<Integer> num, int i, ArrayList<ArrayList<Integer>> result) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		temp.addAll(num);
		if(i >= num.size()){
			result.add(temp);
		}
		for(int j = i ; j <= num.size() - 1; j++) {
			if (containsDuplicate(num, i, j)) {
	
				swap(num,i,j);
				permute(num,i+1,result);
				swap(num,i,j);
			}
		}
	}

	private static boolean containsDuplicate(ArrayList<Integer> num, int i, int j) {
		for(int k = i; k <= j - 1; k++){
			if(num.get(k) == num.get(j)) {
				return false;
			}
		}
		return true;
	}

	private static void swap(ArrayList<Integer> num, int i, int j) {
		int temp = num.get(i);
		num.set(i, num.get(j));
		num.set(j,temp);
	}
}
