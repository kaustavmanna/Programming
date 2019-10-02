package com.linkedlist;

public class LinkedListImpl
{
	public static void main(String[] args)
	{
		//SingleLinkedList<Integer> list1 = new SingleLinkedList<Integer> ();
		//DoubleLinkedList list1 = new DoubleLinkedList();
		
		/*Single Linked List Using Array Test*/
		SingleLinkedListArray list1 = new SingleLinkedListArray();
		
		for(int i = 1; i <= 10; i++)
			list1.insert(i*i);
		list1.traverse();
		list1.delete(10);
		list1.traverse();
		list1.insert(10);
		list1.traverse();
	}
}
