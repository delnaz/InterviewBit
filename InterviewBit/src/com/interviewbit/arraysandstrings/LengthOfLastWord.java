package com.interviewbit.arraysandstrings;

public class LengthOfLastWord {

	public static void main(String[] args) {
		//String s = "    ";
		String s = "Hello World, how are you ?";
		System.out.println(lengthLastWord(s));
	}

	private static int lengthLastWord(String s) {
		if(s == null || s.isEmpty()) {
			return 0;
		}
		boolean flag = false;
		int count = 0;
		String[] st = s.split(" ");
		if(st.length <= 0) {
			return 0;
		}
		int k = st[st.length - 1].length();
		char cc = 0;
		while(k > 0){
			k--;

			cc = st[st.length - 1].charAt(k);
			if((cc >= 'a' && cc <= 'z') ||(cc >= 'A' && cc <= 'Z')) {
				flag = true;
				count++;
			} else {
				if(flag) {
					return count;
				}
			}
		}
		return count;
	}

}
