package com.tree;

import com.stack.LinkedListStack;

public class BinarySearchTree
{
	private BinaryTreeNode<Integer> root;
	
	public BinarySearchTree()
	{
		root = null;
	}
	
	public BinaryTreeNode<Integer> getRoot()
	{
		return this.root;
	}
	
	public void insert(Integer data)
	{
		BinaryTreeNode<Integer> newnode = new BinaryTreeNode<Integer> (data);
		if(root == null)
			root = newnode;
		else
			insert(root, newnode);
	}
	
	private void insert(BinaryTreeNode<Integer> N, BinaryTreeNode<Integer> newnode)
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
	
	public void delete(Integer data)
	{
		if(search(root, data))
		{
			root = delete(root, data);
			System.out.println(data + " is successfully deleted from the tree!");
		}
		else
			System.out.println("Member does not exist in the tree!");
	}
	
	private BinaryTreeNode<Integer> delete(BinaryTreeNode<Integer> N, Integer data)
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
				N.setData(inordersuccessor(N).getData());
				N.setRight(delete(N.getRight(), N.getData()));
			}
		}
		return N;
	}
	
	public void preorder(BinaryTreeNode<Integer> N)
	{
		if(N != null)
		{
			System.out.print(N.getData() + " ");
			
			if(N.getLeft() != null)
				preorder(N.getLeft());
			
			if(N.getRight() != null)
				preorder(N.getRight());
		}
	}
	
	public void inorder(BinaryTreeNode<Integer> N)
	{
		if(N != null)
		{
			if(N.getLeft() != null)
				inorder(N.getLeft());
			System.out.print(N.getData() + " ");
			if(N.getRight() != null)
				inorder(N.getRight());
		}
	}
	
	public void postorder(BinaryTreeNode<Integer> N)
	{
		if(N != null)
		{
			if(N.getLeft() != null)
				postorder(N.getLeft());
			if(N.getRight() != null)
				postorder(N.getRight());
			System.out.print(N.getData() + " ");
		}
	}
	
	public boolean search(BinaryTreeNode<Integer> N, Integer data)
	{
		if(N == null)
			return false;
		else if (N.getData() == data)
			return true;
		else if(N.getData() > data)
			return search(N.getLeft(), data);
		else
			return search(N.getRight(), data);
	}
	
	public BinaryTreeNode<Integer> inordersuccessor(BinaryTreeNode<Integer> N)
	{
		if(N.getRight() != null)
		{
			N = N.getRight();
			while(N.getLeft() != null)
				N = N.getLeft();
			return N;
		}
		
		else
			return null;
	}
	
	public void nonrecursivepreorder(BinaryTreeNode<Integer> N)
	{
		LinkedListStack<BinaryTreeNode<Integer>> stack = new LinkedListStack<BinaryTreeNode<Integer>> ();
		stack.push(N);
		
		while(!stack.isEmpty())
		{
			BinaryTreeNode<Integer> node = stack.pop();
			System.out.print(node.getData() + " ");
			if(node.getRight() != null)
				stack.push(node.getRight());
			if(node.getLeft() != null)
				stack.push(node.getLeft());
		}
	}
	
	public void nonrecursiveinorder(BinaryTreeNode<Integer> N)
	{
		LinkedListStack<BinaryTreeNode<Integer>> stack = new LinkedListStack<BinaryTreeNode<Integer>> ();

		while(true)
		{
			if(N != null)
			{
				stack.push(N);
				N = N.getLeft();
			}
			else if(stack.isEmpty())
				break;
			else
			{
				N = stack.pop();
				System.out.print(N.getData() + " ");
				
				N = N.getRight();
			}
		}
	}
	
	public void nonrecursivepostorder(BinaryTreeNode<Integer> N)
	{
		if(N == null)
			return;
		
		LinkedListStack<BinaryTreeNode<Integer>> stack = new LinkedListStack<BinaryTreeNode<Integer>> ();
		stack.push(N);
		BinaryTreeNode<Integer> prev = null;
		
		while(!stack.isEmpty())
		{
			BinaryTreeNode<Integer> curr = stack.peek();
			
			if(prev == null || prev.getLeft() == curr || prev.getRight() == curr)
			{
				if(curr.getLeft() != null)
					stack.push(curr.getLeft());
				else if(curr.getRight() != null)
					stack.push(curr.getRight());
			}
			else if(curr.getLeft() == prev && curr.getRight() != null)
				stack.push(curr.getRight());
			else
				System.out.print(stack.pop().getData() + " ");
			
			prev = curr;
		}
	}
	
	public BinaryTreeNode<Integer> maximum(BinaryTreeNode<Integer> N)
	{
		if(N == null)
			return null;
		else if(N.getRight() != null)
			return(maximum(N.getRight()));
		else
			return N;
	}
	
	public Integer depth(BinaryTreeNode<Integer> N)
	{
		if(N == null)
			return 0;
		Integer left = depth(N.getLeft());
		Integer right = depth(N.getRight());
		
		if(left > right)
			return (left + 1);
		else
			return (right + 1);
	}
	
	public Integer depthStack(BinaryTreeNode<Integer> N)
	{
		LinkedListStack<BinaryTreeNode<Integer>> stack = new LinkedListStack<BinaryTreeNode<Integer>>();
		BinaryTreeNode<Integer> prev = null;
		Integer depth = 0;
		
		if(N == null)
			return 0;
		
		stack.push(N);
		while(!stack.isEmpty())
		{
			BinaryTreeNode<Integer> curr = stack.peek();
			if(prev == null || prev.getLeft() == curr || prev.getRight() == curr)
			{
				if(curr.getLeft() != null)
					stack.push(curr.getLeft());
				else if(curr.getRight() != null)
					stack.push(curr.getRight());
			}
			else if(curr.getLeft() == prev && curr.getRight() != null)
				stack.push(curr.getRight());
			else
				stack.pop();
			
			prev = curr;
			if(stack.size() > depth)
				depth = stack.size();
		}
		
		return depth;
	}
	
	public Integer countLeaveNode(BinaryTreeNode<Integer> N)
	{
		Integer count = 0;
		LinkedListStack<BinaryTreeNode<Integer>> stack = new LinkedListStack<BinaryTreeNode<Integer>> ();
		
		if(N != null)
			stack.push(N);
		
		while(!stack.isEmpty())
		{
			BinaryTreeNode<Integer> node = stack.pop();

			if (node.getLeft() == null && node.getRight() == null)
				count++;
			if(node.getRight() != null)
				stack.push(node.getRight());
			if(node.getLeft() != null)
				stack.push(node.getLeft());
		}		
		return count;
	}
	
	public Integer countParentNode(BinaryTreeNode<Integer> N)
	{
		int count = 0;
		LinkedListStack<BinaryTreeNode<Integer>> stack = new LinkedListStack<BinaryTreeNode<Integer>> ();
		
		if(N != null)
			stack.push(N);
		
		while(!stack.isEmpty())
		{
			BinaryTreeNode<Integer> node = stack.pop();

			if (node.getLeft() != null || node.getRight() != null)
				count++;
			if(node.getRight() != null)
				stack.push(node.getRight());
			if(node.getLeft() != null)
				stack.push(node.getLeft());
		}		
		return count;
	}
	
	public static int countHalfNode(BinaryTreeNode<Integer> N)
	{
		int count = 0;
		LinkedListStack<BinaryTreeNode<Integer>> stack = new LinkedListStack<BinaryTreeNode<Integer>> ();
		
		if(N != null)
			stack.push(N);
		
		while(!stack.isEmpty())
		{
			BinaryTreeNode<Integer> node = stack.pop();

			if ((node.getLeft() != null && node.getRight() == null) || (node.getLeft() == null && node.getRight() != null))
				count++;
			if(node.getRight() != null)
				stack.push(node.getRight());
			if(node.getLeft() != null)
				stack.push(node.getLeft());
		}		
		return count;
	}
}
