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
	
	/*Insert at the end*/
	public void insertNode(E data)
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
		
		System.out.println(data + " is successfully added in the list!");
	}
	
	/*Insert At A Position*/
	public void insertPosition(int position, E data)
	{
		SingleListNode<E> node = new SingleListNode<E> (data);
		
		if(head == null || position == 1)
		{
			node.setNext(head);
			head = node;
			System.out.println(data + " is added to the list at position: 1");
			return;
		}
		
		SingleListNode<E> N = head;
		
		for(int i = 1; i < position-1 && N != null; i++)
			N = N.getNext();
		
		if(N == null)
		{
			N = head;
			while(N.getNext() != null)
				N = N.getNext();
			N.setNext(node);
			System.out.println("Invalid position mentioned. Therefore adding the element at the end of the list!");
		}
		else
		{
			node.setNext(N.getNext());
			N.setNext(node);
			System.out.println(data + " is added to the list at position: " + position);
		}
	}
	
	/*Delete A Specific Node By Value*/
	public void deleteNode(E data)
	{
		if(head == null)
		{
			System.out.println("The list is empty!");
			return;
		}
			
		if(head.getData() == data)
		{
			head = head.getNext();
			System.out.println(data + " is deleted from the list.");
			return;
		}
		
		SingleListNode<E> N = head;
		
		while(N.getNext() != null)
		{
			if(N.getNext().getData() == data)
			{
				N.setNext(N.getNext().getNext());
				System.out.println(data + " is deleted from the list.");
				return;
			}
			N = N.getNext();
		}
		
		System.out.println(data + " does not exist in the list.");
	}
	
	/*Delete A Specific Node By Position*/
	public void deletePosition(int position)
	{	
		if(position == 1)
		{
			E deleted = head.getData();
			head = head.getNext();
			System.out.println(deleted + " is deleted from position: " + position);
			return;
		}
	
		SingleListNode<E> N = head;
		
		for(int i = 1; i < position - 1 && N != null; i++)
			N = N.getNext();
		
		if(N == null || N.getNext() == null)
			System.out.println("Invalid position requested!");
		else
		{
			E deleted = N.getNext().getData();
			N.setNext(N.getNext().getNext());
			System.out.println(deleted + " is deleted from position: " + position);
		}
	}
}