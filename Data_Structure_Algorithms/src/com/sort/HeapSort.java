/**
 * @author kaustavmanna
 *
 */

package com.sort;

import com.heap.*;

public class HeapSort
{
	public static void sort(int arr[], SortOrder order)
	{
		if(order == SortOrder.Ascending)
		{
			Heap heap = new MinHeap();
			for(int i = 0; i < arr.length; i++)
				heap.insert(arr[i]);
			for(int i = 0; i < arr.length; i++)
				arr[i] = heap.removeTop();
		}
		
		else
		{
			Heap heap = new MaxHeap();
			for(int i = 0; i < arr.length; i++)
				heap.insert(arr[i]);
			for(int i = 0; i < arr.length; i++)
				arr[i] = heap.removeTop();
		}
	}
}
