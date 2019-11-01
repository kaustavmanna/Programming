/**
 * @author kaustavmanna
 *
 */

package com.tree;

public class BinaryTreeNode<E>
{
	private E data;
	private BinaryTreeNode<E> left;
	private BinaryTreeNode<E> right;
	
	public BinaryTreeNode(E data)
	{
		this.data = data;
		left = null;
		right = null;
	}
	
	public E getData()
	{
		return this.data;
	}
	
	public void setData(E data)
	{
		this.data = data;
	}
	
	public BinaryTreeNode<E> getLeft()
	{
		return this.left;
	}
	
	public BinaryTreeNode<E> getRight()
	{
		return this.right;
	}

	public void setLeft(BinaryTreeNode<E> N)
	{
		this.left = N;
	}
	
	public void setRight(BinaryTreeNode<E> N)
	{
		this.right = N;
	}
}
