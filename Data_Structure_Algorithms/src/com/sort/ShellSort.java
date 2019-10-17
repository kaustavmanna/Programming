package com.sort;

/**
 * @author kaustavmanna
 *
 */
public class ShellSort
{
	public static void sort(int arr[], SortOrder order)
	{
		for(int h = arr.length - 1; h >= 1; h = h/2)
		{
			for(int i = 0; i < arr.length; i++)
			{
				int curr = arr[i];
				int j = i;
				
				while(order == SortOrder.Ascending && j >= h && arr[j - h] > curr)
				{
					arr[j] = arr[j - h];
					j = j - h;
				}
				
				while(order == SortOrder.Descending && j >= h && arr[j-h] < curr)
				{
					arr[j] = arr[j - h];
					j = j - h;
				}
				
				arr[j] = curr;
			}
		}
	}
}
