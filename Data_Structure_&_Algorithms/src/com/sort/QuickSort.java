package com.sort;

/**
 * @author kaustavmanna
 *
 */
public class QuickSort
{
	public static void sort(int arr[], SortOrder order)
	{
		sort(arr, 0, arr.length - 1, order);
	}
	
	private static void sort(int arr[], int low, int high, SortOrder order)
	{
		int pivot;
		
		if(low < high)
		{
			pivot = partition(arr, low, high, order);
			pivot = partition_alternate(arr, low, high, order);
			
			sort(arr, low, pivot - 1, order);
			sort(arr, pivot + 1, high, order);
		}
	}
	
	private static int partition(int arr[], int low, int high, SortOrder order)
	{
		int left = low;
		int right = high;
		int pivot = low;
		
		while(true)
		{
			if(order == SortOrder.Ascending)
			{
				while(arr[left] < arr[pivot])
					left++;
				
				while(arr[right] > arr[pivot])
					right--;
			}
			
			else
			{
				while(arr[left] > arr[pivot])
					left++;
				
				while(arr[right] < arr[pivot])
					right--;
			}
			
			if(left >= right)
				break;
			else
				swap(arr, left, right);
		}
		
		swap(arr, right, pivot);
		
		return right;
	}
	
	private static int partition_alternate(int arr[], int low, int high, SortOrder order)
	{
		int pivot = arr[high];
		int i = low - 1;
		
		for(int j = low; j < high; j++)
		{
			if(order == SortOrder.Ascending && arr[j] < pivot)
			{
				i++;
				swap(arr, i, j);
			}
			
			else if(order == SortOrder.Descending && arr[j] > pivot)
			{
				i++;
				swap(arr, i, j);
			}
		}
		
		swap(arr, i + 1, high);
				
		return (i + 1);
	}
	
	private static void swap(int arr[], int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
