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
		//Sorting.BubbleSort(arr, SortOrder.Ascending);
		//Sorting.BubbleSort(arr, SortOrder.Descending);
		//Sorting.SelectionSort(arr, SortOrder.Ascending);
		//Sorting.SelectionSort(arr, SortOrder.Descending);
		//Sorting.InsertionSort(arr, SortOrder.Ascending);
		//Sorting.InsertionSort(arr, SortOrder.Descending);
		//Sorting.ShellSort(arr, SortOrder.Descending);
		//Sorting.MergeSort(arr, SortOrder.Ascending);
		//Sorting.MergeSort(arr, SortOrder.Descending);
		//Sorting.QuickSort(arr2, SortOrder.Ascending);
		Sorting.QuickSort(arr2, SortOrder.Descending);
		
		/*Post Sorting Array*/
		System.out.println("\nAfter sorting the array is: ");
		for(int i = 0; i < arr2.length; i++)
		{
			System.out.print(arr2[i] + " ");
		}
	}
}
