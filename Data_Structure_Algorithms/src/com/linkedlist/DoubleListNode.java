package com.linkedlist;

public class DoubleListNode<E>
{
	private E value;
	private DoubleListNode<E> previous;
	private DoubleListNode<E> next;
	
	public DoubleListNode(E value)
	{
		this.value = value;
		previous = null;
		next = null;
	}
	
	public E getData()
	{
		return this.value;
	}
	
	public DoubleListNode<E> getNext()
	{
		return this.next;
	}
	
	public void setNext(DoubleListNode<E> next)
	{
		this.next = next;
	}
	
	public DoubleListNode<E> getPrevious()
	{
		return this.previous;
	}
	
	public void setPrevious(DoubleListNode<E> previous)
	{
		this.previous = previous;
	}
}