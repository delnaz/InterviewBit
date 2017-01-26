package com.interviewbit.linkedlistandhashing;


public class ListCycle {
	  static class ListNode {
			 
	        int data;
	        ListNode next;
	 
	        ListNode(int d) {
	            data = d;
	            next = null;
	        }
	    }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head;

      head = new ListNode(1);
      head.next = new ListNode(2);
      head.next.next = new ListNode(3);
      head.next.next.next = new ListNode(4);
      head.next.next.next = head.next.next;
      
      detectCycle(head);
	}
	public static ListNode detectCycle(ListNode a) {
	    if(a == null || a.next == null){
	        return a;
	    }
	    ListNode slow = a;
	    ListNode fast = a;
	    while(slow != null && fast != null && fast.next != null) {
	        slow = slow.next;
	        fast = fast.next.next;
			System.out.println("slow :" + slow.data + " fast : " + fast.data);

	        if(slow == fast) {
	            slow = a;
	            while(slow != fast) {
	                slow = slow.next;
	                fast = fast.next;
	            }
	            
	            return slow;
	        }
	    }
	    
	    return null;
	}
}
