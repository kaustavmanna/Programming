/**
 * @author kaustavmanna
 *
 */

package com.searching;

public class OrderedLinearSearch
{
	public static int search(int arr[], int element)
	{
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == element)
				return i;
			else if(arr[i] > element)
				return -1;
		}
		
		return -1;
	}
}
