/**
 * @author kaustavmanna
 *
 */

package com.sort;

public class CountingSort
{
	public static int[] sort(int arr[], int low, int high, SortOrder order)
	{
		int count[] = new int[high - low + 1];
		int sorted[] = new int[arr.length];
		
		/*Initializing Count Array*/
		for(int i = 0; i < count.length; i++)
			count[i] = 0;
		
		/*Counting the array elements*/
		for(int i = 0; i < arr.length; i++)
		{
			int index = arr[i] - low;
			count[index] = count[index] + 1;
		}
		
		int j = 0;
		
		if(order == SortOrder.Ascending)
		{
			for(int i = 0; i < count.length; i++)
			{
				while(count[i] != 0)
				{
					sorted[j] = i + low;
					count[i]--;
					j++;
				}
			}
		}
		else
		{
			for(int i = count.length - 1; i >= 0; i--)
			{
				while(count[i] != 0)
				{
					sorted[j] = i + low;
					count[i]--;
					j++;
				}
			}
		}
		
		return sorted;
	}
}
