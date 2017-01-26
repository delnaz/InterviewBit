package com.interviewbit.linkedlistandhashing;

import com.interviewbit.linkedlistandhashing.RemoveDuplicateFromList.Node;

public class RemoveDuplicates1 {
	  static class ListNode {
			 
	        int val;
	        ListNode next;
	 
	        ListNode(int d) {
	            val = d;
	            next = null;
	        }
	    }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head;

        head = new ListNode(10);
        head.next = new ListNode(12);
        head.next.next = new ListNode(12);
        head.next.next.next = new ListNode(13);
        head.next.next.next.next = new ListNode(14);
        head.next.next.next.next.next = new ListNode(14);
        head.next.next.next.next.next.next = new ListNode(14);
        deleteDuplicates(head);
	}
	public static ListNode deleteDuplicates(ListNode a) {
	    if(a == null || a.next == null) {
	        return a;
	    }
	    ListNode prev = a;
	    ListNode next = a.next;
	    while(prev != null && prev.next != null) {
	        if(prev.val == next.val) {
	            prev.next = next.next;
	            next = next.next;
	        } else {
	            prev = next;
	            next = next.next;
	        }
	    }
	    while (a != null) {
            System.out.print(a.val + " ");
            a = a.next;
        }
	    return a;
	}
}
