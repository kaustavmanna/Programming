/**
 * @author kaustavmanna
 *
 */

package com.heap;

public class MinHeap implements Heap
{
	private Integer minheap[];
	private int heapsize;
	
	public MinHeap()
	{
		minheap = new Integer[1];
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
		if(heapsize == 0)
			return null;
		else
			return minheap[0];
	}

	@Override
	public void insert(Integer data)
	{
		if(heapsize == minheap.length)
			increasesize();
		
		minheap[heapsize++] = data;
		heapifyup(heapsize-1);		
	}

	@Override
	public Integer removeTop()
	{
		if(heapsize == 0)
			return null;
		else
		{
			Integer removed = minheap[0];
			heapsize--;
			minheap[0] = minheap[heapsize];
			
			if(heapsize != 0)
				heapifydown(0);
			return removed;
		}
	}
	
	private void heapifyup(int position)
	{
		Integer temp = minheap[position];
		
		while(position > 0 && temp < minheap[parent(position)])
		{
			minheap[position] = minheap[parent(position)];
			position = parent(position);
		}
		minheap[position] = temp;
	}
	
	private void heapifydown(int position)
	{
		int left = leftChild(position);
		int right = rightChild(position);
		int min = position;
		
		if(left != -1 && minheap[position] > minheap[left])
			min = left;
		if(right != -1 && minheap[min] > minheap[right])
			min = right;
			
		if(min != position)
		{
			Integer temp = minheap[position];
			minheap[position] = minheap[min];
			minheap[min] = temp;
			heapifydown(min);
		}
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
	
	private void increasesize()
	{
		Integer temp[] = new Integer[minheap.length<<1];
		for(int i = 0; i < minheap.length; i++)
			temp[i] = minheap[i];
		minheap = temp;
	}
}
