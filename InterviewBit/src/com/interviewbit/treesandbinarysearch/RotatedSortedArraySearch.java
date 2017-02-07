package com.interviewbit.treesandbinarysearch;

import java.util.ArrayList;
import java.util.List;

public class RotatedSortedArraySearch {

	public static int search(final List<Integer> a, int b) {
	    int left = 0;
	    int right = a.size() - 1;
	    while(left <= right) {
	        int mid = left + (right - left)/2;
	        if(a.get(mid) == b ) {
	            return mid ;
	        }
	        if(a.get(left) <= a.get(mid)) {
	            if(a.get(left) <= b && b< a.get(mid)) {
	                right = mid - 1;
	            }
	            else {
	                left = mid + 1;
	            }
	        }
	        else if(a.get(mid) < b && b <= a.get(right)){
	            left = mid + 1;
	        } else {
	            right = mid - 1;
	        }
	    }
	    return -1;
	}
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>();
		a.add(4);
		a.add(5);
		a.add(6);
		a.add(7);
		a.add(0);
		a.add(1);
		a.add(2);
		System.out.println(search(a,4));
	}

}
