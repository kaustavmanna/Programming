/**
 * @author kaustavmanna
 *
 */

package com.heap;

public class HeapImpl
{
	public static void main(String args[])
	{
		//Heap heap = new MaxHeap();
		Heap heap = new MinHeap();
		
		heap.insert(19);
		heap.insert(87);
		heap.insert(65);
		heap.insert(45);
		heap.insert(43);
		heap.insert(23);
		heap.insert(21);
		heap.insert(10);
		
		System.out.println("Element removed: " + heap.removeTop());
		System.out.println("Element removed: " + heap.removeTop());
		System.out.println("Element removed: " + heap.removeTop());
		System.out.println("Element removed: " + heap.removeTop());
		System.out.println("Element removed: " + heap.removeTop());
		System.out.println("Element removed: " + heap.removeTop());
		System.out.println("Element removed: " + heap.removeTop());
		System.out.println("Element removed: " + heap.removeTop());
		System.out.println("Element removed: " + heap.removeTop());
	}
}
