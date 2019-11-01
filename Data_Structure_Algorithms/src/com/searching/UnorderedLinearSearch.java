/**
 * @author kaustavmanna
 *
 */

package com.searching;

public class UnorderedLinearSearch
{
	public static int search(int arr[], int element)
	{
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == element)
				return i;
		}
		
		return -1;
	}
}
