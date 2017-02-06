package com.interviewbit.treesandbinarysearch;


public class MaxDepthOfBinaryTree {
	class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	public static void main(String[] args) {
		MaxDepthOfBinaryTree x = new MaxDepthOfBinaryTree();
		TreeNode a = x.new TreeNode(1);
		a.left = x.new TreeNode(2);
		a.right = x.new TreeNode(5);
		a.left.left = x.new TreeNode(3);
		a.left.right = x.new TreeNode(4);
		a.right.right = x.new TreeNode(6);
		a.right.right.right = x.new TreeNode(8);
		System.out.println(maxDepth(a));
	}
	private static int maxDepth(TreeNode a) {
		if(a == null) {
			return 0;
		}
		return 1 + Math.max(maxDepth(a.left), maxDepth(a.right));
	}

}
