package Tree;

import Stack.LinkedListStack;

public class Tree
{
	public static void preorder(BinaryTreeNode N)
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
	
	public static void inorder(BinaryTreeNode N)
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
	
	public static void postorder(BinaryTreeNode N)
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
	
	public static boolean search(BinaryTreeNode N, int data)
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
	
	public static BinaryTreeNode inordersuccessor(BinaryTreeNode N)
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
	
	public static void nonrecursivepreorder(BinaryTreeNode N)
	{
		LinkedListStack<BinaryTreeNode> stack = new LinkedListStack<BinaryTreeNode> ();
		stack.push(N);
		
		while(!stack.isEmpty())
		{
			BinaryTreeNode node = stack.pop();
			System.out.print(node.getData() + " ");
			if(node.getRight() != null)
				stack.push(node.getRight());
			if(node.getLeft() != null)
				stack.push(node.getLeft());
		}
	}
	
	public static void nonrecursiveinorder(BinaryTreeNode N)
	{
		LinkedListStack<BinaryTreeNode> stack = new LinkedListStack<BinaryTreeNode> ();

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
	
	public static void nonrecursivepostorder(BinaryTreeNode N)
	{
		if(N == null)
			return;
		
		LinkedListStack<BinaryTreeNode> stack = new LinkedListStack<BinaryTreeNode> ();
		stack.push(N);
		BinaryTreeNode prev = null;
		
		while(!stack.isEmpty())
		{
			BinaryTreeNode curr = stack.peek();
			
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
	
	/*Applicable only for Binary Search Tree*/
	public static BinaryTreeNode maximum(BinaryTreeNode N)
	{
		if(N == null)
			return null;
		else if(N.getRight() != null)
			return(maximum(N.getRight()));
		else
			return N;
	}
	
	public static int depth(BinaryTreeNode N)
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
	
	public static int depthStack(BinaryTreeNode N)
	{
		LinkedListStack<BinaryTreeNode> stack = new LinkedListStack<BinaryTreeNode>();
		BinaryTreeNode prev = null;
		int depth = 0;
		
		if(N == null)
			return 0;
		
		stack.push(N);
		while(!stack.isEmpty())
		{
			BinaryTreeNode curr = stack.peek();
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
	
	public static int countLeaveNode(BinaryTreeNode N)
	{
		int count = 0;
		LinkedListStack<BinaryTreeNode> stack = new LinkedListStack<BinaryTreeNode> ();
		
		if(N != null)
			stack.push(N);
		
		while(!stack.isEmpty())
		{
			BinaryTreeNode node = stack.pop();

			if (node.getLeft() == null && node.getRight() == null)
				count++;
			if(node.getRight() != null)
				stack.push(node.getRight());
			if(node.getLeft() != null)
				stack.push(node.getLeft());
		}		
		return count;
	}
	
	public static int countParentNode(BinaryTreeNode N)
	{
		int count = 0;
		LinkedListStack<BinaryTreeNode> stack = new LinkedListStack<BinaryTreeNode> ();
		
		if(N != null)
			stack.push(N);
		
		while(!stack.isEmpty())
		{
			BinaryTreeNode node = stack.pop();

			if (node.getLeft() != null || node.getRight() != null)
				count++;
			if(node.getRight() != null)
				stack.push(node.getRight());
			if(node.getLeft() != null)
				stack.push(node.getLeft());
		}		
		return count;
	}
	
	public static int countHalfNode(BinaryTreeNode N)
	{
		int count = 0;
		LinkedListStack<BinaryTreeNode> stack = new LinkedListStack<BinaryTreeNode> ();
		
		if(N != null)
			stack.push(N);
		
		while(!stack.isEmpty())
		{
			BinaryTreeNode node = stack.pop();

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
