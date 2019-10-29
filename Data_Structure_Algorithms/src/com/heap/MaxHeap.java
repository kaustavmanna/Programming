package com.heap;

import com.tree.BinaryTreeNode;
/**
 * @author kaustavmanna
 *
 */
public class MaxHeap<E> implements Heap<E>
{
	private BinaryTreeNode<E> root;
	
	public MaxHeap()
	{
		root = null;
	}

	@Override
	public E getTop()
	{
		return root.getData();
	}

	@Override
	public BinaryTreeNode<E> removeTop()
	{
		return null;
	}

	@Override
	public void insert(E data)
	{
		// TODO Auto-generated method stub
	}

	@Override
	public void delete(E data)
	{
		// TODO Auto-generated method stub
	}
}
