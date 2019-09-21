package Sort;

/**
 * @author kaustavmanna
 *
 */
public class Sorting
{
	public static void BubbleSort(int arr[], SortOrder order)
	{
		boolean swapped = true;
		for(int i = 0; i < arr.length && swapped; i++)
		{
			swapped = false;
			for(int j = 0; j < arr.length - 1; j++)
			{
				if(order == SortOrder.Ascending && arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
				
				else if(order == SortOrder.Descending && arr[j] < arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
			}
		}
	}
	
	/*Selection Sort*/
	public static void SelectionSort(int arr[], SortOrder order)
	{
		for(int i = 0; i < arr.length - 1; i++)
		{
			int min = i;
			int max = i;
			
			for(int j = i+1; j < arr.length; j++)
			{
				if(order == SortOrder.Ascending && arr[j] < arr[min])
					min = j;
				else if(order == SortOrder.Descending && arr[j] > arr[max])
					max = j;
			}
			
			if(order == SortOrder.Ascending)
			{
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
			
			else
			{
				int temp = arr[i];
				arr[i] = arr[max];
				arr[max] = temp;
			}
			
		}
	}
	
	/*Insertion Sorting*/
	public static void InsertionSort(int arr[], SortOrder order)
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
	
	/*Shell Sort*/
	public static void ShellSort(int arr[], SortOrder order)
	{
		for(int h = arr.length - 1; h >= 1; h = h/2)
		{
			for(int i = 0; i < arr.length; i++)
			{
				int curr = arr[i];
				int j = i;
				
				while(order == SortOrder.Ascending && j >= h && arr[j - h] > curr)
				{
					arr[j] = arr[j - h];
					j = j - h;
				}
				
				while(order == SortOrder.Descending && j >= h && arr[j-h] < curr)
				{
					arr[j] = arr[j - h];
					j = j - h;
				}
				
				arr[j] = curr;
			}
		}
	}
}
