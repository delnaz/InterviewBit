package com.interviewbit.linkedlistandhashing;


public class AddTwoNumbers {
	 static class ListNode {
		 
	        int val;
	        ListNode next;
	 
	        ListNode(int d) {
	            val = d;
	            next = null;
	        }

	    }
	
	 public static void main(String[] args) {
		ListNode A;

        A = new ListNode(9);
        A.next = new ListNode(9);
        A.next.next = new ListNode(1);
    	ListNode B;

        B = new ListNode(1);
      //  B.next = new ListNode(6);
        //B.next = new ListNode(5);
        
        addTwoNumbers(A,B);
        
	}

	 public static ListNode addTwoNumbers(ListNode A, ListNode B) {
	
		 	ListNode node;
		    ListNode prev = null;
		    ListNode first = null;
		    int carry = 0;
		    int sum = 0;

		    while (A != null || B != null || carry != 0) {
		        node = new ListNode(0);
		        sum = carry;
		        if (first == null)
		            first = node;

		        if (prev != null)
		            prev.next = node;
		        
		        A.val = (A != null) ? A.val : 0;
		        if(B == null) {
		        	B = new ListNode (0);
		        }
		        
				 node.val  = (A.val + B.val + carry) % 10;
				 
				 carry = (A.val + B.val + carry) / 10;
				 
				 A = A.next;
				 B = B.next;
		        prev = node;
		    }
		    while (first != null) {
	            System.out.print(first.val + " ");
	            first = first.next;
	        }
		 return first;
	 }
}
