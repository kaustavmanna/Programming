package com.sort;

/**
 * @author kaustavmanna
 *
 */
public class BubbleSort
{
	public static void sort(int arr[], SortOrder order)
	{
		boolean swapped = true;
		for(int i = 0; i < arr.length && swapped; i++)
		{
			swapped = false;
			for(int j = 0; j < arr.length - 1; j++)
			{
				if(order == SortOrder.Ascending && arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
				
				else if(order == SortOrder.Descending && arr[j] < arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
			}
		}
	}
}
