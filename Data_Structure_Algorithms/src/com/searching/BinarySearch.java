package com.searching;

/**
 * @author kaustavmanna
 *
 */
public class BinarySearch
{
	public static int iterativesearch(int arr[], int element)
	{
		int low = 0;
		int high = arr.length - 1;
		
		while(low <= high)
		{
			int mid = (low + high) / 2;
			
			if(arr[mid] == element)
				return mid;
			else if(arr[mid] > element)
				high = mid - 1;
			else
				low = mid + 1;
		}
		return -1;
	}
	
	public static int recursivesearch(int arr[], int element)
	{
		return recursivesearch(arr, 0, arr.length - 1, element);
	}
	
	public static int recursivesearch(int arr[], int low, int high, int element)
	{
		int mid = (low + high) / 2;
		
		if(low > high)
			return -1;
		else if(arr[mid] == element)
			return mid;
		else if(arr[mid] > element)
			return (recursivesearch(arr, low, mid - 1, element));
		else
			return (recursivesearch(arr, mid + 1, high, element));
	}
}
