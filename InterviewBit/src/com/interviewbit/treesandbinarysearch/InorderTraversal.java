package com.interviewbit.treesandbinarysearch;

import java.util.ArrayList;
import java.util.Stack;

import com.interviewbit.treesandbinarysearch.IdenticalBinaryTree.TreeNode;

public class InorderTraversal {

	 class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	TreeNode a,b;
	
	public ArrayList<Integer> inorderTraversal(TreeNode a) {
	    ArrayList<Integer> output = new ArrayList<Integer>();
	    if(a == null) {
	        return output;
	    }
	    Stack<TreeNode> stack = new Stack<TreeNode>();
	    TreeNode temp = a;
	    while(!stack.isEmpty() || temp != null) {
	        if(temp != null) {
	            stack.push(temp);
	            temp = temp.left;
	        } else {
	            temp = stack.pop();
	            output.add(temp.val);
	            temp = temp.right;
	        }
	    }
	    return output;
	}
}
