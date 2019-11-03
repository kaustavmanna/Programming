/**
 * @author kaustavmanna
 *
 */

package com.heap;

public class HeapImpl
{
	public static void main(String args[])
	{
		Heap heap = new MaxHeap();
		heap.insert(2);
		heap.insert(1);
		heap.insert(3);
		
		System.out.println("Element removed: " + heap.removeTop());
		System.out.println("Element removed: " + heap.removeTop());
		System.out.println("Element removed: " + heap.removeTop());
		System.out.println("Element removed: " + heap.removeTop());
	}
}
