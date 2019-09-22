package Tree;

public class BinaryTree
{
	private BinaryTreeNode root;
	
	public BinaryTree()
	{
		root = null;
	}
	
	public BinaryTreeNode getRoot()
	{
		return this.root;
	}
	
	public void insertRoot(int data)
	{
		if(root == null)
		{
			BinaryTreeNode node = new BinaryTreeNode(data);
			root = node;
		}
		else
			System.out.println("Root is already present!");
	}
	
	public void insertRight(int node, int data)
	{
		BinaryTreeNode N = search(root, node);
		if(N == null)
			System.out.println("Invalid Parent Node: " + node);
		else
			insertRight(N, data);
	}
	
	private void insertRight(BinaryTreeNode N, int data)
	{
		BinaryTreeNode node = new BinaryTreeNode(data);
		
		if(N.getRight() == null)
			N.setRight(node);
		else
			System.out.println("Member already exists at Right of " + N.getData());
	}
	
	public void insertLeft(int node, int data)
	{
		BinaryTreeNode N = search(root, node);
		if(N == null)
			System.out.println("Invalid Parent Node: " + node);
		else
			insertLeft(N, data);
	}
	
	private void insertLeft(BinaryTreeNode N, int data)
	{
		BinaryTreeNode node = new BinaryTreeNode(data);
		
		if(N.getLeft() == null)
			N.setLeft(node);
		else
			System.out.println("Member already exists at Left of " + N.getData());
	}
	
	private BinaryTreeNode search(BinaryTreeNode N, int data)
	{
		BinaryTreeNode result;
		
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
}
