package com.sort;

/**
 * @author kaustavmanna
 *
 */
public class SortingImpl
{
	public static void main(String[] args)
	{
		//int arr[] = {1, 10, 2, 9, 3, 8, 4, 7, 5, 6};
		int arr2[] = {19, 12, 38, 24, 57, 36, 76, 48, 95, 10};
		
		/*Before Sorting Array*/
		System.out.println("Before sorting the array is: ");
		for(int i = 0; i < arr2.length; i++)
		{
			System.out.print(arr2[i] + " ");
		}
		
		/*Calling Sort Method*/
		//BubbleSort.sort(arr, SortOrder.Ascending);
		//BubbleSort.sort(arr, SortOrder.Descending);
		
		//SelectionSort.sort(arr, SortOrder.Ascending);
		//SelectionSort.sort(arr, SortOrder.Descending);
		
		//InsertionSort.sort(arr, SortOrder.Ascending);
		//InsertionSort.sort(arr, SortOrder.Descending);
		
		//ShellSort.sort(arr, SortOrder.Ascending);
		//ShellSort.sort(arr, SortOrder.Descending);
		
		//MergeSort.sort(arr, SortOrder.Ascending);
		//MergeSort.sort(arr, SortOrder.Descending);
		
		//QuickSort.sort(arr2, SortOrder.Ascending);
		//QuickSort.sort(arr2, SortOrder.Descending);
		
		//int sorted[] = CountingSort.sort(arr2, 1, 100, SortOrder.Ascending);
		int sorted[] = CountingSort.sort(arr2, 1, 100, SortOrder.Descending);
		
		/*Post Sorting Array*/
		System.out.println("\nAfter sorting the array is: ");
		for(int i = 0; i < sorted.length; i++)
		{
			System.out.print(sorted[i] + " ");
		}
	}
}
