package com.linkedlist;

public class SingleLinkedList<E>
{
	SingleListNode<E> head;
	
	public SingleLinkedList()
	{
		head = null;
	}
	
	public void traverse()
	{
		if(head == null)
			System.out.println("The List is Empty.");
		else
		{
			System.out.println("Current Linked List is: ");
			
			for(SingleListNode<E> N = head; N != null; N = N.getNext())
				System.out.print(N.getData() + " ");
			System.out.println();
		}
	}
	
	//Insert at the end
	public void insert(E data)
	{
		SingleListNode<E> node = new SingleListNode<E> (data);
		SingleListNode<E> N = head;
		if(head == null)
			head = node;
		else
		{
			while(N.getNext() != null)
				N = N.getNext();
			N.setNext(node);
		}
	}
	
	//Delete From Any Position
	public void delete(E data)
	{
		boolean status = false;
		if(head != null)
		{
			SingleListNode<E> N = head;
			
			if(N.getData() == data)
			{
				head = head.getNext();
				status = true;
			}
			else
			{
				while(N.getNext() != null)
				{
					if(N.getNext().getData() == data)
					{
						N.setNext(N.getNext().getNext());
						status = true;
						break;
					}
					N = N.getNext();
				}
			}
		}
		
		if(status == true)
			System.out.println(data + " is deleted from the list.");
		else
			System.out.println(data + " does not exist in the list.");
	}
}