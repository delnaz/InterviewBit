package com.interviewbit.arraysandstrings;

public class Atoi {

	public static void main(String[] args) {
		String str = " 92 53 6576 86345";
		System.out.println(atoi(str));
	}

	private static int atoi(String str) {
		
		if (str == null || str.length() < 1)
			return 0;
		str = str.trim();
		int i = 0;
		Boolean flag = false;
		//char flag = '+';
		if(str.charAt(0) == '-') {
			//flag = '-';
			flag = false;
			i++;
		} else if(str.charAt(0) == '+'){
			flag = true;
			i++;
		}
		double res = 0;
		while(str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
			res = res *10 + (str.charAt(i) - '0');
			i++;
		}
		
		if(flag == true) {
			res = -res;
		}
		if(res > Integer.MAX_VALUE) {
			res = Integer.MAX_VALUE;
		}
		if(res < Integer.MIN_VALUE) {
			res = Integer.MIN_VALUE;
		}
		return (int) res;
	}

}
