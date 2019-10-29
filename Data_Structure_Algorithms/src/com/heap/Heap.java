package com.heap;

import com.tree.BinaryTreeNode;

public interface Heap<E>
{
	public E getTop();
	public BinaryTreeNode<E> removeTop();
	public void insert(E data);
	public void delete(E data);
}