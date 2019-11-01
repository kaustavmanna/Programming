/**
 * @author kaustavmanna
 *
 */

package com.sort;

public class MergeSort
{
	public static void sort(int arr[], SortOrder order)
	{
		sort(arr, 0, arr.length -1, order);
	}
	
	private static void sort(int arr[], int low, int high, SortOrder order)
	{
		if(low < high)
		{
			int middle = (low + high) / 2;
			
			sort(arr, low, middle, order);
			sort(arr, middle + 1, high, order);
			
			merge(arr, low, middle, high, order);
		}
	}
	
	private static void merge(int arr[], int low, int middle, int high, SortOrder order)
	{
		int left[] = new int[middle - low + 1];
		int right[] = new int[high - middle];
		
		for(int i = 0; i < left.length; i++)
			left[i] = arr[low + i];
		for(int j = 0; j < right.length; j++)
			right[j] = arr[middle + 1 + j];
		
		int i = 0, j = 0;
		int k = low;
		
		while(i < left.length && j < right.length)
		{
			if(order == SortOrder.Ascending)
			{
				if(left[i] > right[j])
				{
					arr[k] = right[j];
					j++;
				}
				else
				{
					arr[k] = left[i];
					i++;
				}
			}
			
			else
			{
				if(left[i] > right[j])
				{
					arr[k] = left[i];
					i++;
				}
				else
				{
					arr[k] = right[j];
					j++;
				}
			}
			
			k++;
		}
		
		while(i < left.length)
		{
			arr[k] = left[i];
			k++;
			i++;
		}
		
		while(j < right.length)
		{
			arr[k] = right[j];
			k++;
			j++;
		}
	}
}
