package com.interviewbit.arraysandstrings;

import java.util.ArrayList;

public class SetMatrixZero {

	public static void main(String[] args) {
		//int[][] mat = {{1,1,1,0},{1,1,1,1},{1,1,1,1}};
		ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		ArrayList<Integer> a3 = new ArrayList<Integer>();
		a1.add(1);
		a1.add(1);
		a1.add(1);
		a1.add(0);
		a2.add(1);
		a2.add(1);
		a2.add(1);
		a2.add(1);
		a3.add(1);
		a3.add(1);
		a3.add(1);
		a3.add(1);
		a.add(a1);
		a.add(a2);
		a.add(a3);
		set(a);
	}

	private static void set(ArrayList<ArrayList<Integer>> mat) {
		
		int[] row = new int[mat.size()];
		int[] col = new int[mat.get(0).size()];
		for(int k = 0; k < mat.size() ;k++) {
			row[k] = 0;
		}
		for(int k = 0; k < mat.get(0).size() ;k++) {
			col[k] = 0;
		}
		for(int  i = 0 ; i< mat.size() ; i++) {
			for( int j = 0; j< mat.get(0).size(); j++) {
				if(mat.get(i).get(j) == 0) {
					row[i] = 1;
					col[j] = 1;
				}
			}
		}

		for(int  i = 0 ; i< mat.size() ; i++) {
			for( int j = 0; j< mat.get(0).size(); j++) {
				if(row[i] == 1) {
					mat.get(i).set(j,0);
				}
				if(col[j] == 1) {
					mat.get(i).set(j,0);
				}
			}
		}
		for(int  i = 0 ; i< mat.size() ; i++) {
			for( int j = 0; j< mat.get(0).size(); j++) {
		System.out.println(mat.get(i).get(j));
			}
		}

	}


}
