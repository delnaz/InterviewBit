package com.interviewbit.linkedlistandhashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TwoSum {

	 public static ArrayList<Integer> twoSum(final List<Integer> a, int b) {

	        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	        ArrayList<Integer> result = new ArrayList<Integer>();
	       
	        for(int i = 0; i < a.size(); i++){
	            if(map.containsKey(a.get(i))){
	                int index = map.get(a.get(i));
	                result.add(index + 1);
	                result.add(i + 1);
	                break;
	            }
	            else{
	                map.put(b - a.get(i), i);
	                
	            }
	        }
		 System.out.println(result);
			return result;
		    }
	public static void main(String[] args) {
		List<Integer> a  = Arrays.asList( 4, 7, -4, 2, 2, 2, 3, -5, -3, 9, -4, 9, -7, 7, -1, 9, 9, 4, 1, -4, -2, 3, -3, -5, 4, -7, 7, 9, -4, 4, -8 );
		twoSum(a,-3);
	}

}
