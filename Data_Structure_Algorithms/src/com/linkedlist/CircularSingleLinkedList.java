package com.linkedlist;

/**
 * @author kaustavmanna
 *
 */
public class CircularSingleLinkedList<E>
{
	private SingleListNode<E> head;
	
	public CircularSingleLinkedList()
	{
		head = null;
	}
	
	public void deletelist()
	{
		head = null;
	}
	
	public int size()
	{
		int count = 0;
		if(head != null)
		{
			SingleListNode<E> N = head;
			count = 1;
			while(N.getNext() != head)
			{
				count++;
				N = N.getNext();
			}
		}
		return count;
	}
	
	public void traverse()
	{
		if(head == null)
			System.out.println("List is Empty!");
		else
		{
			System.out.println("Current elements in the list are: ");
			SingleListNode<E> N = head;
			do
			{
				System.out.print(N.getData() + " ");
				N = N.getNext();
			}while(N != head);
			System.out.println("");
		}
	}
	
	public void insertNode(E data)
	{
		SingleListNode<E> newnode = new SingleListNode<E>(data);
		
		if(head == null)
		{
			head = newnode;
			newnode.setNext(newnode);
		}
		else
		{
			SingleListNode<E> N = head;
			while(N.getNext() != head)
				N = N.getNext();
			N.setNext(newnode);
			newnode.setNext(head);
		}
	}
	
	public void insertPosition(int position, E data)
	{
		
	}
}
