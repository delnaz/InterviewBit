package com.interviewbit.treesandbinarysearch;

import com.interviewbit.treesandbinarysearch.MaxDepthOfBinaryTree.TreeNode;

public class MinDepthBinaryTree {
	class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	public static void main(String[] args) {
		MinDepthBinaryTree x = new MinDepthBinaryTree();
		TreeNode a = x.new TreeNode(1);
		a.left = x.new TreeNode(2);
		a.right = x.new TreeNode(5);
		a.left.left = x.new TreeNode(3);
		a.left.right = x.new TreeNode(4);
		a.right.right = x.new TreeNode(6);
		a.right.right.right = x.new TreeNode(8);
		System.out.println(minDepth(a));
	}
	private static int minDepth(TreeNode a) {
		if(a == null) {
			return 0;
		}
		if(a.left == null && a.right == null) {
			return 1;
		}
		if(a.left == null) {
			return minDepth(a.right) + 1;
		}
		if(a.right == null) {
			return minDepth(a.left) + 1;
		}
		return 1 + Math.min(minDepth(a.left), minDepth(a.right));
	}
}
