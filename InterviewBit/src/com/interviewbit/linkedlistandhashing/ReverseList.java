package com.interviewbit.linkedlistandhashing;


public class ReverseList {
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

		        A = new ListNode(1);
		        A.next = new ListNode(2);
		        A.next.next = new ListNode(3);
		        A.next.next.next = new ListNode(4);
		        A.next.next.next.next = new ListNode(5);
		        
		        getReversedList(A,2,4);
			}

		 public static void getReversedList(ListNode A, int m, int n){
			 
			 ListNode preHead = new ListNode(0);
			 preHead.next = A;
			 ListNode prev = preHead;
			 ListNode curr =A;
			 ListNode end = A;
			 int countm = 1;
			 int countn = 1;
			 
			 while(countm < m || countn < n) {
				 if(countm < m) {
					 prev = prev.next;
					 curr = curr.next;
					 countm++;
				 }
				 if(countn < n) {
					 end = end.next;
					 countn++;
				 }
				 System.out.println(countm + " :: m");
				 System.out.println(countn + " :: n");
			 }
			 print(prev);
			 print(end);
			 reverseList(prev,end.next);
			print(preHead.next);
		 }

		 private static void print(ListNode node) {
			 while(node != null){
				 System.out.println(node.val + "::: ");
				 node = node.next;
			 }
		 }
		private static void reverseList(ListNode prev, ListNode end) {
			ListNode cur = prev.next;
			while(cur.next != end) {
				ListNode next1  = cur.next;
				ListNode temp = prev.next;
				prev.next = next1;
				cur.next = next1.next;
				next1.next = temp;
			}
		}
}
