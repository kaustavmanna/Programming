package com.linkedlist;

public class LinkedListImpl
{
	public static void main(String[] args)
	{
		//SingleLinkedList<Integer> list1 = new SingleLinkedList<Integer> ();
		//DoubleLinkedList<Integer> list1 = new DoubleLinkedList<Integer> ();
		
		/*Single Linked List Using Array Test*/
		SingleLinkedListArray list1 = new SingleLinkedListArray();
		
		for(int i = 1; i <= 10; i++)
			list1.insertNode(i*i);
		list1.traverse();
		list1.insertPosition(100, 99);
		list1.traverse();
		//list1.deletePosition(11);
		list1.traverse();
		//list1.deletePosition(5);
		list1.traverse();
		list1.insertNode(10);
		list1.traverse();
	}
}
