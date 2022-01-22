package com.test.algoritm.binary.tree;

public class BinaryTree {
	
	private TreeNode root;
	
	private class TreeNode{
		private TreeNode left;
		private TreeNode right;
		private int data;
		
		public TreeNode(int data) {			
			this.data=data;
			left = null;
			right = null;			
		}
		
			
	}
	
	public void createBinaryTree() {	
		TreeNode first = new TreeNode(1);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		TreeNode fifth = new TreeNode(5);
		TreeNode sixth = new TreeNode(6);
		TreeNode seventh = new TreeNode(7);
		root = first;
		first.left = second;
		first.right = third;
		
		second.left = fourth;
		
		third.right = fifth;
		
		third.left = seventh;
		
		fourth.right = sixth;
	}
	
	public void preOrder(TreeNode root) {
		if(root == null) {
			return;
		}
		
		System.out.println(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public void inOrder(TreeNode root) {		
		if(root == null) {
			return;
		}		
		inOrder(root.left);
		System.out.println(root.data+" ");
		inOrder(root.right);
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree tree = new BinaryTree();
		tree.createBinaryTree();
		tree.preOrder(tree.root);
		tree.inOrder(tree.root);

	}

}
