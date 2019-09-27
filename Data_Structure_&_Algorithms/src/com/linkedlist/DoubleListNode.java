package com.linkedlist;

public class DoubleListNode
{
	int value;
	DoubleListNode previous;
	DoubleListNode next;
	
	public DoubleListNode(int value)
	{
		this.value = value;
		previous = null;
		next = null;
	}
	
	public int getData()
	{
		return this.value;
	}
	
	public DoubleListNode getNext()
	{
		return this.next;
	}
	
	public void setNext(DoubleListNode next)
	{
		this.next = next;
	}
	
	public DoubleListNode getPrevious()
	{
		return this.previous;
	}
	
	public void setPrevious(DoubleListNode previous)
	{
		this.previous = previous;
	}
}