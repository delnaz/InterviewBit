package com.interviewbit.treesandbinarysearch;

import com.interviewbit.treesandbinarysearch.IdenticalBinaryTree.TreeNode;

public class BalancedBinaryTree {
	
	 class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }

	public static int isBalanced(TreeNode a) {
	    
	    int leftHeight, rightHeight ;
	    if(a == null) {
	        return 1;
	    }
	    leftHeight = getHeight(a.left);
	    rightHeight = getHeight(a.right);
	    
	    if(Math.abs(leftHeight - rightHeight) <= 1 && isBalanced(a.left) == 1  && isBalanced(a.right) == 1){
	        return 1;
	    }
	    return 0;
	}
	
	public static int getHeight(TreeNode a) {
	    if(a == null ){
	        return 0;
	    }
	    return 1 + Math.max(getHeight(a.left),getHeight(a.right));
	}
	public static void main(String[] args) {
		BalancedBinaryTree x = new BalancedBinaryTree();
		TreeNode a = x.new TreeNode(1);
		a.left = x.new TreeNode(2);
		a.right = x.new TreeNode(3);
		//a.left.left = x.new TreeNode(4);
		//a.left.left.left = x.new TreeNode(5);
		System.out.println(isBalanced(a));
		
	}

}
