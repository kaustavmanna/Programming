package Sort;

/**
 * @author kaustavmanna
 *
 */
public class SortingImpl
{
	public static void main(String[] args)
	{
		int arr[] = {1,10,2,9,3,8,4,7,5,6};
		
		/*Before Sorting Array*/
		System.out.println("Before sorting the array is: ");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		
		/*Calling Sort Method*/
		//Sorting.BubbleSort(arr, SortOrder.Ascending);
		//Sorting.BubbleSort(arr, SortOrder.Descending);
		//Sorting.SelectionSort(arr, SortOrder.Ascending);
		//Sorting.SelectionSort(arr, SortOrder.Descending);
		//Sorting.InsertionSort(arr, SortOrder.Ascending);
		//Sorting.InsertionSort(arr, SortOrder.Descending);
		Sorting.ShellSort(arr, SortOrder.Descending);
		
		
		/*Post Sorting Array*/
		System.out.println("\nAfter sorting the array is: ");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}
