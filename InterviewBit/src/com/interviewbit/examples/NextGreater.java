package com.interviewbit.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class NextGreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(2,95,1,3,34,33,36,12,8,57,88));
		ArrayList<Integer> arr = new ArrayList<Integer>();
		nextGreater(arr);
	}

	private static ArrayList<Integer> nextGreater(ArrayList<Integer> arr) {
		
		ArrayList<Integer> res = new ArrayList<Integer>(arr.size());
		
    	if(arr.isEmpty()) {
    	    return res;
    	}
		for(int i = 0 ;i<arr.size(); i++) {
			int found = 0;

			for(int j = i+1; j < arr.size(); j++) {

				if(arr.get(i) < arr.get(j)) {
					res.add(arr.get(j));
					found = 1;
					break;
				}
				
			}
			if(found == 0) {
				res.add(-1);
			}
		}
		
		System.out.println(Arrays.toString(res.toArray()));
		return res;
		
		
		
		
		// TODO Auto-generated method stub
		/*ArrayList<Integer> res = new ArrayList<Integer>();
		Stack<Integer> arrStack = new Stack<Integer>();
		for(int i=0; i< arr.size();i++){
			System.out.println(arr.get(i));
			arrStack.push(arr.get(i));
			System.out.println(arr.get(arrStack.peek()));
			
			while(!arrStack.isEmpty() && arrStack.peek() < arr.get(i)) {
				res.add(arrStack.pop());
			}
			
		}
		System.out.println(Arrays.toString(res.toArray()));
		return res;*/
		
		
		
		/*
		
		final List<Integer> dataSetList = new ArrayList<Integer>();
        final Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < arr.size(); i++) {

            while (!stack.isEmpty() && stack.peek() < arr.get(i)) {
                dataSetList.add(new Integer(stack.pop()));
            }

            stack.push(arr.get(i));
        }

        while (!stack.isEmpty()) {
            dataSetList.add(new Integer(stack.pop()));
        }

		System.out.println(Arrays.toString(dataSetList.toArray()));

        return dataSetList;*/
        
	}

}
