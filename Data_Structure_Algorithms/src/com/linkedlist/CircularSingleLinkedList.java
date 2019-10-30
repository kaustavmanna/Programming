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
		System.out.println("The list is deleted!");
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
		SingleListNode<E> N = head;
		int i = 1;
		for(; N.getNext() != head && i <= position; i++)
			N = N.getNext();
		if(i != position)
			System.out.println("Invalid Position Requested!");
		else
		{
			SingleListNode<E> newnode = new SingleListNode<E>(data);
			N.setNext(newnode);
			newnode.setNext(head);
		}
	}
	
	public void deleteNode(E data)
	{
		if(head == null)
		{
			System.out.println("The list is empty!");
			return;
		}
		
		SingleListNode<E> N = head;
		
		if(N.getData() == data)
		{
			while(N.getNext() != head)
				N = N.getNext();
			N.setNext(head.getNext());
			SingleListNode<E> temp = head.getNext();
			head.setNext(null);
			head = temp;
			
			System.out.println(data + " is deleted from the list!");
			return;
		}
		else
		{
			while(N.getNext() != head)
			{
				if(N.getNext().getData() == data)
				{
					SingleListNode<E> temp = N.getNext();
					N.setNext(temp.getNext());
					temp.setNext(null);
					System.out.println(data + " is deleted from the list!");
					return;
				}
				N = N.getNext();
			}
			System.out.println(data + " does not exist in the list!");
		}
	}
	
	public void deletePosition(int position)
	{
		if(head == null)
		{
			System.out.println("The list is empty!");
			return;
		}
		
		else if(position == 1)
		{
			E data = head.getData();
			SingleListNode<E> N = head;
			
			while(N.getNext() != head)
				N = N.getNext();
			
			N.setNext(head.getNext());
			N = head.getNext();
			head.setNext(null);
			head = N;
			System.out.println(data + " is deleted from the list!");
		}
		else
		{
			int i = 1;
			SingleListNode<E> N = head;
			
			for(; N.getNext() != head && i < position; i++)
				N = N.getNext();
			
			if(i != position)
			{
				System.out.println("Invalid position requested!");
				return;
			}
			else
			{
				E data = N.getNext().getData();
				SingleListNode<E> temp = N.getNext();
				N.setNext(temp.getNext());
				temp.setNext(null);
				System.out.println(data + " is deleted from the list!");
			}
		}
	}
}
