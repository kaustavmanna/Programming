package com.tree;

public class BinarySearchTree
{
	private BinaryTreeNode root;
	
	public BinarySearchTree()
	{
		root = null;
	}
	
	public BinaryTreeNode getRoot()
	{
		return this.root;
	}
	
	public void insert(int data)
	{
		BinaryTreeNode newnode = new BinaryTreeNode (data);
		if(root == null)
			root = newnode;
		else
			insert(root, newnode);
	}
	
	private void insert(BinaryTreeNode N, BinaryTreeNode newnode)
	{
		if(N.getData() >= newnode.getData())
		{
			if(N.getLeft() != null)
				insert(N.getLeft(), newnode);
			else
				N.setLeft(newnode);
		}		
		else
		{
			if(N.getRight() != null)
				insert(N.getRight(), newnode);
			else
				N.setRight(newnode);
		}
	}
	
	public void delete(int data)
	{
		if(Tree.search(root, data))
		{
			root = delete(root, data);
			System.out.println(data + " is successfully deleted from the tree!");
		}
		else
			System.out.println("Member does not exist in the tree!");
	}
	
	private BinaryTreeNode delete(BinaryTreeNode N, int data)
	{
		if (N == null)
			return null;
		
		else if(N.getData() > data)
			N.setLeft(delete(N.getLeft(), data));
		
		else if(N.getData() < data)
			N.setRight(delete(N.getRight(), data));
		
		else
		{
			if(N.getLeft() == null)
				return N.getRight();
			else if(N.getRight() == null)
				return N.getLeft();
			else
			{
				N.setData(Tree.inordersuccessor(N).getData());
				N.setRight(delete(N.getRight(), N.getData()));
			}
		}
		return N;
	}
}
