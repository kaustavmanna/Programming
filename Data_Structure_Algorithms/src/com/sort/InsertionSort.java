/**
 * @author kaustavmanna
 *
 */

package com.sort;

public class InsertionSort
{
	public static void sort(int arr[], SortOrder order)
	{
		for(int i = 1; i < arr.length; i++)
		{
			int j = i;
			int curr = arr[i];
			
			while(order == SortOrder.Ascending && j >= 1 && arr[j-1] > curr)
			{
				arr[j] = arr[j-1];
				j--;
			}
			
			while(order == SortOrder.Descending && j >= 1 && arr[j-1] < curr)
			{
				arr[j] = arr[j-1];
				j--;
			}
			
			arr[j] = curr;
		}
	}
}
