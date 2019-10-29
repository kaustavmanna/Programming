package com.linkedlist;

public class DoubleLinkedList<E>
{
	private DoubleListNode<E> head;

	public DoubleLinkedList()
	{
		this.head = null;
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
			for(DoubleListNode<E> N = head; N != null; N = N.getNext())
				count++;
		}
		return count;
	}
	
	public void traverse()
	{
		if(head == null)
			System.out.println("The List is Empty!");
		else
		{
			System.out.println("The Current List is: ");
			for(DoubleListNode<E> N = head; N != null; N = N.getNext())
				System.out.print(N.getData() + " ");
			System.out.println();
		}
	}
	
	/*Insert At Last*/
	public void insertNode(E data)
	{
		DoubleListNode<E> newnode = new DoubleListNode<E> (data);
		DoubleListNode<E> N = head;
		
		if(head == null)
		{
			head = newnode;
			System.out.println(data + " is added to the list!");
			return;
		}
		
		while(N.getNext() != null)
			N = N.getNext();
		
		N.setNext(newnode);
		newnode.setPrevious(N);
		System.out.println(data + " is added to the list!");
	}
	
	/*Insert At Mentioned Position*/
	public void insertPosition(int position, E data)
	{
		DoubleListNode<E> node = new DoubleListNode<E> (data);
		
		if(head == null || position == 1)
		{
			node.setNext(head.getNext());
			if(head.getNext() != null)
				head.getNext().setPrevious(node);
			head = node;
			
			System.out.println(data + " is added to the list at position: 1");
			return;
		}
		
		DoubleListNode<E> N = head;
		
		for(int i = 1; i < position - 1 && N != null; i++)
			N = N.getNext();
		
		if(N == null)
		{
			N = head;
			while(N.getNext() != null)
				N = N.getNext();
			N.setNext(node);
			node.setPrevious(N);
			System.out.println("Invalid position is mentioned. Therefore " + data + " is added to the list!");
		}
		else
		{
			node.setNext(N.getNext());
			if(N.getNext() != null)
				N.getNext().setPrevious(node);
			N.setNext(node);
			node.setPrevious(N);
			
			System.out.println(data + " is added to the list at position: " + position);
		}
	}
	
	/*Delete A Specific Node By Value*/
	public void deleteNode(E data)
	{
		if(head.getData() == data)
		{
			head = head.getNext();
			head.setPrevious(null);
			System.out.println(data + " is successfully deleted from the list!");
		}
		else
		{
			DoubleListNode<E> N = head;
			
			while(N != null)
			{
				if(N.getData() == data)
					break;
				N = N.getNext();
			}
			
			if(N == null)
				System.out.println("The requested element does not exist in the list!");
			else
			{
				N.getPrevious().setNext(N.getNext());
				N.getNext().setPrevious(N.getPrevious());
				System.out.println(data + " is successfully deleted from the list!");
			}
		}
	}
	
	/*Delete A Specific Node By Position*/
	public void deletePosition(int position)
	{
		if(position == 1)
		{
			E deleted = head.getData();
			head.getNext().setPrevious(null);
			head = head.getNext();
			System.out.println(deleted + " is deleted from position: " + position);
			return;
		}
	
		DoubleListNode<E> N = head;
		
		for(int i = 1; i < position - 1 && N != null; i++)
			N = N.getNext();
		
		if(N == null || N.getNext() == null)
			System.out.println("Invalid position requested!");
		else
		{
			E deleted = N.getNext().getData();
			
			if(N.getNext().getNext() != null)
				N.getNext().getNext().setPrevious(N);
			N.setNext(N.getNext().getNext());
			
			System.out.println(deleted + " is deleted from position: " + position);
		}
	}
}
