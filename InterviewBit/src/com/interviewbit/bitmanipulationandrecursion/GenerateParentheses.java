package com.interviewbit.bitmanipulationandrecursion;

import java.util.ArrayList;

public class GenerateParentheses {

	public static void main(String[] args) {
		int n = 3;
		generatePar(n);
	}

	private static void generatePar(int n) {
		ArrayList<String> res = new ArrayList<String>();
		geneParen(res,"",n,n);
		System.out.println(res);
	}

	private static void geneParen(ArrayList<String> res, String string, int left, int right) {
		if(left > right) {
			return;
		}
		if(left == 0 && right == 0) {
			res.add(string);
			return;
		}
		if(left > 0) {
			geneParen(res, string + "(", left - 1, right);
		}
		if(right > 0 ){
			geneParen(res, string + " )", left, right - 1);
		}
	}

	
}
