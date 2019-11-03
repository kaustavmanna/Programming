/**
 * @author kaustavmanna
 *
 */

package com.linkedlist;

public class SingleLinkedListArray
{
	private Integer list[];
	private Integer listsize;
	
	public SingleLinkedListArray ()
	{
		list = new Integer[1];
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
	public void insertNode(Integer data)
	{
		if(listsize == list.length)
			increasesize();
			
		list[listsize] = data;
		listsize++;
		
		System.out.println(data + " inserted in the list successfully!");
	}
	
	public void delete(Integer data)
	{
		if (listsize == 0)
			System.out.println("List is empty!");
		else
		{
			int i = 0;
			while(i < listsize)
			{
				if(list[i] == data)
					break;
				i++;
			}
			
			if(i == listsize)
				System.out.println("Requested element does not exist in the list!");
			else
			{
				for(int j = i; j < listsize - 1; j++)
					list[j] = list[j + 1]; 
				listsize--;
				
				System.out.println(data + " deleted from the list successfully!");
			}
		}
	}		

	private void increasesize()
	{
		Integer temp[] = new Integer[list.length * 2];
		for(int i = 0; i < list.length; i++)
			temp[i] = list[i];
		list = temp;
	}
}
