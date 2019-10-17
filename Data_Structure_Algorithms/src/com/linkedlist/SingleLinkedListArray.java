package com.linkedlist;

/**
 * @author kaustavmanna
 *
 */
public class SingleLinkedListArray
{
	private int list[];
	private int listsize;
	
	public SingleLinkedListArray ()
	{
		list = new int[1];
		listsize = 0;
	}
	
	public void traverse()
	{
		if(listsize == 0)
			System.out.println("List is empty!");
		else
		{
			System.out.println("Current list is:");
			for(int i = 0; i < listsize; i++)
				System.out.print(list[i] + " ");
			System.out.println();
		}
	}
	
	/*Inserting Value At The End*/
	public void insertNode(int data)
	{
		if(listsize == list.length)
			list = listsizeincrease(list);
			
		list[listsize] = data;
		listsize++;
		
		System.out.println(data + " inserted in the list successfully!");
	}
	
	/*Inserting value At Mentioned Position*/
	public void insertPosition(int position, int data)
	{
		if(position > listsize)
			System.out.println("Invalid position mentioned!");
		else
		{
			if(listsize == list.length)
				list = listsizeincrease(list);
			
			for(int i = listsize - 1; i >= position; i--)
			{
				
			}
		}
	}
	
	public void delete(int data)
	{
		if (listsize == 0)
			System.out.println("List is empty!");
		else
		{
			int index = searchindex(data);
			if( index == -1)
				System.out.println("Requested element does not exist in the list!");
			else
			{
				for(int i = index; i < listsize-1; i++)
					list[i] = list[i+1]; 
				listsize--;
				
				System.out.println(data + " deleted from the list successfully!");
			}
		}
	}
	
	public void search(int data)
	{
		if(searchindex(data) != -1)
			System.out.println(data + " exists in the list!");
		else
			System.out.println(data + " does not exist in the list!");
	}
	
	private int searchindex(int data)
	{
		for(int i = 0; i < listsize; i++)
		{
			if (list[i] == data)
				return i;
		}
		
		return -1;
	}
	
	private int[] listsizeincrease(int arr[])
	{
		int temp[] = new int[arr.length * 2];
		for(int i = 0; i < arr.length; i++)
			temp[i] = arr[i];
		arr = temp;
		return arr;
	}
}
