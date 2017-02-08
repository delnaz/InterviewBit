package com.interviewbit.bitmanipulationandrecursion;

import java.util.ArrayList;
import java.util.HashMap;

public class LetterPhone {

	public static ArrayList<String> letterCombinations(String a) {
	    HashMap<Integer,String> map = new HashMap<Integer,String>();
	    map.put(2,"abc");
	    map.put(3,"def");
	    map.put(4,"ghi");
	    map.put(5,"jkl");
	    map.put(6,"mno");
	    map.put(7,"pqrs");
	    map.put(8,"tuv");
	    map.put(9,"wxyz");
	    map.put(0,"0");
	    map.put(1,"1");
	    
	    
	    ArrayList<String> result = new ArrayList<String>();
	 	    
	    if(a == null || a.length() == 0) {
	        return result;
	    }
	    
	    ArrayList<Character> temp = new ArrayList<Character>();
	    getString(a,temp,result,map);
	
	    return result;
	}
	
	public static void getString(String a,ArrayList<Character> temp, ArrayList<String> result,HashMap<Integer,String> map) {
	    if(a.length() == 0) {
	        char[] c = new char[temp.size()];
	        for(int i =0 ; i< temp.size(); i++) {
	            c[i] = temp.get(i);
	        }
	        result.add(String.valueOf(c));
	        return;
	    }
	    
	    Integer x = Integer.valueOf(a.substring(0,1));
	    String l = map.get(x);
	    for(int i =0; i < l.length() ;i++){
	        temp.add(l.charAt(i));
	        getString(a.substring(1),temp,result,map);
	        temp.remove(temp.size() - 1);
	   }
	}
	public static void main(String[] args) {
		System.out.println(letterCombinations("1"));
	}

}
