package com.tree;

import com.stack.ListNodeStack;

public class BinaryTree<E>
{
	private BinaryTreeNode<E> root;
	
	public BinaryTree()
	{
		root = null;
	}
	
	public BinaryTreeNode<E> getRoot()
	{
		return this.root;
	}
	
	public void insertRoot(E data)
	{
		if(root == null)
		{
			BinaryTreeNode<E> node = new BinaryTreeNode<E>(data);
			root = node;
		}
		else
			System.out.println("Root is already present!");
	}
	
	public void insertRight(E node, E data)
	{
		BinaryTreeNode<E> N = search(root, node);
		if(N == null)
			System.out.println("Invalid Parent Node: " + node);
		else
			insertRight(N, data);
	}
	
	private void insertRight(BinaryTreeNode<E> N, E data)
	{
		BinaryTreeNode<E> node = new BinaryTreeNode<E>(data);
		
		if(N.getRight() == null)
			N.setRight(node);
		else
			System.out.println("Member already exists at Right of " + N.getData());
	}
	
	public void insertLeft(E node, E data)
	{
		BinaryTreeNode<E> N = search(root, node);
		if(N == null)
			System.out.println("Invalid Parent Node: " + node);
		else
			insertLeft(N, data);
	}
	
	private void insertLeft(BinaryTreeNode<E> N, E data)
	{
		BinaryTreeNode<E> node = new BinaryTreeNode<E>(data);
		
		if(N.getLeft() == null)
			N.setLeft(node);
		else
			System.out.println("Member already exists at Left of " + N.getData());
	}
	
	private BinaryTreeNode<E> search(BinaryTreeNode<E> N, E data)
	{
		BinaryTreeNode<E> result;
		
		if(N == null)
			return null;
		else if (N.getData() == data)
			return N;
		else
		{
			result = search(N.getLeft(), data);
			if(result == null)
				result = search(N.getRight(), data);
		}
		return result;
	}
	
	public void preorder(BinaryTreeNode<E> N)
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
	
	public void inorder(BinaryTreeNode<E> N)
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
	
	public void postorder(BinaryTreeNode<E> N)
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
	
	public BinaryTreeNode<E> inordersuccessor(BinaryTreeNode<E> N)
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
	
	public void nonrecursivepreorder(BinaryTreeNode<E> N)
	{
		ListNodeStack<BinaryTreeNode<E>> stack = new ListNodeStack<BinaryTreeNode<E>> ();
		stack.push(N);
		
		while(!stack.isEmpty())
		{
			BinaryTreeNode<E> node = stack.pop();
			System.out.print(node.getData() + " ");
			if(node.getRight() != null)
				stack.push(node.getRight());
			if(node.getLeft() != null)
				stack.push(node.getLeft());
		}
	}
	
	public void nonrecursiveinorder(BinaryTreeNode<E> N)
	{
		ListNodeStack<BinaryTreeNode<E>> stack = new ListNodeStack<BinaryTreeNode<E>> ();

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
	
	public void nonrecursivepostorder(BinaryTreeNode<E> N)
	{
		if(N == null)
			return;
		
		ListNodeStack<BinaryTreeNode<E>> stack = new ListNodeStack<BinaryTreeNode<E>> ();
		stack.push(N);
		BinaryTreeNode<E> prev = null;
		
		while(!stack.isEmpty())
		{
			BinaryTreeNode<E> curr = stack.peek();
			
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
	
	public int depth(BinaryTreeNode<E> N)
	{
		if(N == null)
			return 0;
		int left = depth(N.getLeft());
		int right = depth(N.getRight());
		
		if(left > right)
			return (left + 1);
		else
			return (right + 1);
	}
	
	public int depthStack(BinaryTreeNode<E> N)
	{
		ListNodeStack<BinaryTreeNode<E>> stack = new ListNodeStack<BinaryTreeNode<E>>();
		BinaryTreeNode<E> prev = null;
		int depth = 0;
		
		if(N == null)
			return 0;
		
		stack.push(N);
		while(!stack.isEmpty())
		{
			BinaryTreeNode<E> curr = stack.peek();
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
	
	public int countLeaveNode(BinaryTreeNode<E> N)
	{
		int count = 0;
		ListNodeStack<BinaryTreeNode<E>> stack = new ListNodeStack<BinaryTreeNode<E>> ();
		
		if(N != null)
			stack.push(N);
		
		while(!stack.isEmpty())
		{
			BinaryTreeNode<E> node = stack.pop();

			if (node.getLeft() == null && node.getRight() == null)
				count++;
			if(node.getRight() != null)
				stack.push(node.getRight());
			if(node.getLeft() != null)
				stack.push(node.getLeft());
		}		
		return count;
	}
	
	public int countParentNode(BinaryTreeNode<E> N)
	{
		int count = 0;
		ListNodeStack<BinaryTreeNode<E>> stack = new ListNodeStack<BinaryTreeNode<E>> ();
		
		if(N != null)
			stack.push(N);
		
		while(!stack.isEmpty())
		{
			BinaryTreeNode<E> node = stack.pop();

			if (node.getLeft() != null || node.getRight() != null)
				count++;
			if(node.getRight() != null)
				stack.push(node.getRight());
			if(node.getLeft() != null)
				stack.push(node.getLeft());
		}		
		return count;
	}
	
	public int countHalfNode(BinaryTreeNode<E> N)
	{
		int count = 0;
		ListNodeStack<BinaryTreeNode<E>> stack = new ListNodeStack<BinaryTreeNode<E>> ();
		
		if(N != null)
			stack.push(N);
		
		while(!stack.isEmpty())
		{
			BinaryTreeNode<E> node = stack.pop();

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
