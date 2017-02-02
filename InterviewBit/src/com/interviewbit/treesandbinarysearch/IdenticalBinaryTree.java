package com.interviewbit.treesandbinarysearch;

public class IdenticalBinaryTree {

	 class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
		TreeNode a,b;

	public int isSameTree(TreeNode a, TreeNode b) {
	    if(a == null && b ==null) {
	        return 1;
	    } else if((a != null && b == null) || (a== null && b != null)) {
	        return 0;
	    } else if (a.val == b.val && (isSameTree(a.left,b.left) == 1) && (isSameTree(a.right,b.right) == 1)) {
	        return 1;
	    } else {
	        return 0;
	    }
	}

}
