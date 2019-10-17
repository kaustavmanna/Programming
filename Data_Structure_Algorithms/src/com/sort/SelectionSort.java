package com.sort;

/**
 * @author kaustavmanna
 *
 */
public class SelectionSort
{
	public static void sort(int arr[], SortOrder order)
	{
		for(int i = 0; i < arr.length - 1; i++)
		{
			int min = i;
			int max = i;
			
			for(int j = i+1; j < arr.length; j++)
			{
				if(order == SortOrder.Ascending && arr[j] < arr[min])
					min = j;
				else if(order == SortOrder.Descending && arr[j] > arr[max])
					max = j;
			}
			
			if(order == SortOrder.Ascending)
			{
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
			
			else
			{
				int temp = arr[i];
				arr[i] = arr[max];
				arr[max] = temp;
			}		
		}
	}
}
