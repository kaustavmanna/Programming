/**
 * @author kaustavmanna
 *
 */

package com.heap;

public class MaxHeap implements Heap
{
	private Integer maxheap[];
	private Integer heapsize;
	
	public MaxHeap()
	{
		maxheap = new Integer[1];
		heapsize = 0;
	}
	
	@Override
	public boolean isEmpty()
	{
		if(heapsize == 0)
			return true;
		else
			return false;
	}
	
	@Override
	public Integer getTop()
	{
		return maxheap[0];
	}

	@Override
	public void insert(Integer data)
	{
		if(heapsize == maxheap.length)
			increasesize();
		maxheap[heapsize++] = data;
		heapifyup(heapsize-1);
		System.out.println(data + " is added to the heap!");
	}
	
	@Override
	public Integer removeTop()
	{
		if(heapsize == 0)
		{
			System.out.println("Heap is empty!");
			return null;
		}
		else
		{
			swap(0, heapsize-1);
			Integer removed = maxheap[heapsize-1];
			heapsize--;
			maxheap[heapsize] = null;
			
			if(heapsize != 0)
				heapifydown(0);
			
			return removed;
		}
	}
	
	private void heapifyup(int position)
	{
		Integer temp = maxheap[position];
		
		while(position > 0 && maxheap[position] > maxheap[parent(position)])
		{
			maxheap[position] = maxheap[parent(position)];
			position = parent(position);
		}
		maxheap[position] = temp;
	}
	
	private void heapifydown(int position)
	{
		int left = leftChild(position);
		int right = rightChild(position);
		int max = position;
		
		if(left != -1 && maxheap[left] > maxheap[position])
			max = left;
		if(right != -1 && maxheap[right] > maxheap[max])
			max = right;
		if(max != position)
		{
			swap(position, max);
			heapifydown(max);
		}
	}
	
	private void increasesize()
	{
		Integer temp[] = new Integer[maxheap.length * 2];
		for(int i = 0; i < maxheap.length; i++)
			temp[i] = maxheap[i];
		maxheap = temp;
	}
	
	private int parent(int position)
	{
		return (position - 1) / 2;
	}
	
	private int leftChild(int position)
	{
		int left = position * 2 + 1;
		if(left >= heapsize)
			return -1;
		else
			return left;
	}
	
	private int rightChild(int position)
	{
		int right = position * 2 + 2;
		if(right >= heapsize)
			return -1;
		else
			return right;
	}
	
	private void swap(int source, int target)
	{
		Integer temp = maxheap[source];
		maxheap[source] = maxheap[target];
		maxheap[target] = temp;
	}
}
