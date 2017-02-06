package com.interviewbit.treesandbinarysearch;

import java.util.Stack;

import com.interviewbit.treesandbinarysearch.IdenticalBinaryTree.TreeNode;

public class BinaryTreeToLinkedList {

	class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	
	public static TreeNode flatten(TreeNode a) {
		
		Stack<TreeNode> s = new Stack<TreeNode>();
		TreeNode t = a;
		while(t != null || !s.empty()) {
			if(t.right != null){
				s.push(t.right);
			}
			if(t.left != null) {
				t.right = t.left;
				t.left = null;
			}
			else if(!s.empty()) {
				TreeNode temp = s.pop();
				t.right = temp;
			}
			t = t.right;
		}
		
        while(a != null) {
        	System.out.print(a.val + " -> ");
        	a = a.right;
        }
        return a;
	}
	
	public static void main(String[] args) {
		BinaryTreeToLinkedList x = new BinaryTreeToLinkedList();
		TreeNode a = x.new TreeNode(1);
		a.left = x.new TreeNode(2);
		a.right = x.new TreeNode(5);
		a.left.left = x.new TreeNode(3);
		a.left.right = x.new TreeNode(4);
		a.right.right = x.new TreeNode(6);
		
		flatten(a);
	}

}
