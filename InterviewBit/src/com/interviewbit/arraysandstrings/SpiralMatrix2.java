package com.interviewbit.arraysandstrings;

import java.util.ArrayList;

public class SpiralMatrix2 {
	public static ArrayList<ArrayList<Integer>> prettyPrint(int n) {
		int[][] a = new int[n][n];

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

		if(a.length == 0){
			System.out.println("error");
			return result;
		}
		int row = a.length;
		int col = a.length;
		
		int t = 0;
		int b = row-1;
		int l = 0;
		int r = col-1;
		int k = 0;
		int[][] array = new int[row][col];
		
		while(l <= r && t <= b) {
			
			for(int i=l; i<= r; i++){
				k = k + 1;
				array[t][i] = k;
			}
			t++;

			for(int i=t; i<= b; i++){
				k = k + 1;
				array[i][r] = k;
			}
			r--;

			for(int i=r; i >=l; i--){
				k = k + 1;
				array[b][i] = k;
			}
			b--;

			for(int i=b; i >= t; i--){
				k = k + 1;
				array[i][l] = k;
			}
			l++;
		}
		
		  for (int p = 0; p < row; p++) {
	            ArrayList<Integer> list = new ArrayList<>();
	            for (int q = 0; q < col; q++) {
	                list.add(array[p][q]);
	            }
	            result.add(list);
	        }
System.out.println(result);
	        return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
			prettyPrint(n);
	}

}
