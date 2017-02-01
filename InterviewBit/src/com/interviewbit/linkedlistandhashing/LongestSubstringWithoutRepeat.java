package com.interviewbit.linkedlistandhashing;

import java.util.HashMap;

public class LongestSubstringWithoutRepeat {

	public static void main(String[] args) {
		String str = "abcabca";
		longestSubstring(str);

	}

	private static void longestSubstring(String str){
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		int start = 0;
		int max = 0;
		int prevIndex;
		for(int i =0 ; i < str.length(); i++) {
			char c = str.charAt(i);
			if(!map.containsKey(c)) {
				start++;
				map.put(c,i);
			} else {
				prevIndex = map.get(c);
				start = Math.min(start + 1, i - prevIndex);
				map.put(c,i);
			}
			max = Math.max(max,start);
		}
		System.out.println(max);
	}
}
