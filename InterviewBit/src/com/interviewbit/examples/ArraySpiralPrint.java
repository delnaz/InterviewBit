package com.interviewbit.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;


/**
 * 
 * 
 * @author ZED-DEV
 *
 *
 *
 *Print concentric rectangular pattern in a 2d matrix. 
Let us show you some examples to clarify what we mean.

Example 1:

Input: A = 4.
Output:

4 4 4 4 4 4 4 
4 3 3 3 3 3 4 
4 3 2 2 2 3 4 
4 3 2 1 2 3 4 
4 3 2 2 2 3 4 
4 3 3 3 3 3 4 
4 4 4 4 4 4 4 
Example 2:

Input: A = 3.
Output:

3 3 3 3 3 
3 2 2 2 3 
3 2 1 2 3 
3 2 2 2 3 
3 3 3 3 3 
The outermost rectangle is formed by A, then the next outermost is formed by A-1 and so on.

You will be given A as an argument to the function you need to implement, and you need to return a 2D array.

See Expected Output
Notes

 */
public class ArraySpiralPrint {
	
		public static ArrayList<ArrayList<Integer>> prettyPrint(int a) {
				
		        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

				if(a == 0){
					System.out.println("error");
					return result;
				}
				int row = 2*( a-1) + 1;
				int col = 2*( a-1) + 1;
				
				int t = 0;
				int b = row-1;
				int l = 0;
				int r = col-1;
				
				int[][] array = new int[row][col];
				
				while(l <= r && t <= b) {
					
					for(int i=l; i<= r; i++){
						array[t][i] = a;
					}
					t++;

					for(int i=t; i<= b; i++){
						array[i][r] = a;
					}
					r--;

					for(int i=r; i >=l; i--){
						array[b][i] = a;
					}
					b--;

					for(int i=b; i >= t; i--){
						array[i][l] = a;
					}
					l++;
					a--;
				}
				
				  for (int p = 0; p < row; p++) {
			            ArrayList<Integer> list = new ArrayList<>();
			            for (int q = 0; q < col; q++) {
			                list.add(array[p][q]);
			            }
			            result.add(list);
			        }

			        return result;
			}
			public static void main(String[] args) {
				// TODO Auto-generated method stub
					prettyPrint(5);
			}
			
}
			
