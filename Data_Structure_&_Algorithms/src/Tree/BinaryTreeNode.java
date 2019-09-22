package Tree;

public class BinaryTreeNode
{
	private int data;
	private BinaryTreeNode left;
	private BinaryTreeNode right;
	
	public BinaryTreeNode(int data)
	{
		this.data = data;
		left = null;
		right = null;
	}
	
	public int getData()
	{
		return this.data;
	}
	
	public void setData(int data)
	{
		this.data = data;
	}
	
	public BinaryTreeNode getLeft()
	{
		return this.left;
	}
	
	public BinaryTreeNode getRight()
	{
		return this.right;
	}

	public void setLeft(BinaryTreeNode N)
	{
		this.left = N;
	}
	
	public void setRight(BinaryTreeNode N)
	{
		this.right = N;
	}
}
