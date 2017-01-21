package com.interviewbit.arraysandstrings;

public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			romanToInt("XIV");
	}

	private static void romanToInt(String string) {
		/*  int i=0;
	        int ret=0;
	        String codes[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
	        int val[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
	        while(A.length()>0)
	        {
	            while(A.startsWith(codes[i]))
	            {
	                ret+=val[i];
	                A=A.substring(codes[i].length());
	            }
	            i++;
	        }
	        System.out.println(ret);
	        return ret;
		
		
		*/
		
		string = string.toUpperCase();
		int decimal = 0;
		int lastNum = 0;
		for(int i = string.length() - 1; i >= 0 ; i--) {
			char c = string.charAt(i);
			switch(c) {
				case 'I' : 
					decimal = decimalCal(1,lastNum,decimal);
					lastNum = 1;
					break;
				case 'V' :
					decimal = decimalCal(5,lastNum,decimal);
					lastNum = 5;
					break;
				case 'X' :
					decimal = decimalCal(10,lastNum,decimal);
					lastNum = 10;
					break;
				case 'L' :
					decimal = decimalCal(50,lastNum,decimal);
					lastNum = 50;
					break;
				case 'C' :
					decimal = decimalCal(100,lastNum,decimal);
					lastNum = 100;
					break;
				case 'D' :
					decimal = decimalCal(500,lastNum,decimal);
					lastNum = 500;
					break;
				case 'M' :
					decimal = decimalCal(1000,lastNum,decimal);
					lastNum = 1000;
					break;
			}
			
			
				
		}
		System.out.println(decimal);
	}

	private static int decimalCal(int i, int lastNum, int decimal) {
		if(lastNum > i) {
			return decimal - i;
		} else {
			return decimal + i;

		}
	}

}
