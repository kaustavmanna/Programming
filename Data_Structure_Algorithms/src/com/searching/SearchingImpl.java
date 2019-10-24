package com.searching;

/**
 * @author kaustavmanna
 *
 */
public class SearchingImpl
{
	public static void main(String[] args)
	{
		int unsortedarr[] = {1, 10, 2, 9, 3, 8, 4, 7, 5, 6};
		int sortedarr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		System.out.println("Number 16 position in unsorted array is: " + UnorderedLinearSearch.search(unsortedarr, 16));
		System.out.println("Number 16 position in sorted array is: " + OrderedLinearSearch.search(sortedarr, 16));
		System.out.println("Number 11 position in sorted array is (Binary Iterative Search): " + BinarySearch.iterativesearch(sortedarr, 11));
		System.out.println("Number 11 position in sorted array is (Binary Recursive Search): " + BinarySearch.recursivesearch(sortedarr, 11));
 	}
}
