package LinkedList;

public class LinkedListImpl
{
	public static void main(String[] args)
	{
		SingleLinkedList<Integer> list1 = new SingleLinkedList<Integer> ();
		//DoubleLinkedList list1 = new DoubleLinkedList();
		list1.insert(10);
		list1.insert(25);
		list1.insert(5);
		list1.insert(1);
		list1.insert(7);
		
		list1.traverse();
		
		list1.delete(5);
		
		list1.traverse();
	}
}
