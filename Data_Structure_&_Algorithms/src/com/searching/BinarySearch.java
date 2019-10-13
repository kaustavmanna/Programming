package com.searching;

/**
 * @author kaustavmanna
 *
 */
public class BinarySearch
{
	public static boolean binarysearch(int arr[], int element)
	{
		return binarysearch(arr, 0, arr.length-1, element);
	}
	
	public static boolean binarysearch(int arr[], int low, int high, int element)
	{
		int mid = arr.length / 2;
		
		if(arr[low] == element)
			return true;
		else if(arr[mid] > element)
			return (binarysearch(arr, low, mid, element));
		else if(arr[mid] < element)
			return (binarysearch(arr, mid+1, high, element));
		else
			return false;
	}
}
