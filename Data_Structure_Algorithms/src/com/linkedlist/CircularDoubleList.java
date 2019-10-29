package com.linkedlist;

/**
 * @author kaustavmanna
 *
 */
public class CircularDoubleList<E>
{
	private DoubleListNode<E> head;
	
	public CircularDoubleList()
	{
		head = null;
	}
	
	public int size()
	{
		int count = 0;
		if(head != null)
		{
			DoubleLinkedList<E> N = head;
			count++;
			while(N.getNext() != head)
			{
				N = N.getNext();
				count++;
			}
		}
		return count;
	}
}
