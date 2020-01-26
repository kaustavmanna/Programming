/**
 * @author kaustavmanna
 *
 */

/* In this problem, you are given integers.
 * You need to find the maximum number of unique integers among all the possible contiguous subarrays of size .
 */

import java.util.*;

public class Problem_4
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int length = in.nextInt();
		int sublength = in.nextInt();
		int arr[] = new int[length];
		
		for(int i = 0; i < length; i++)
			arr[i] = in.nextInt();
		
		int max = 0;
		int count = 0;
		HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < length; i++)
		{
			if(i >= sublength)
			{
				int val = hashmap.get(arr[i-sublength]);
				if(val == 1)
				{
					hashmap.remove(arr[i-sublength]);
					count--;
				}
				else
					hashmap.put(arr[i-sublength], (val-1));
			}
			
			if(hashmap.containsKey(arr[i]))
			{
				int val = hashmap.get(arr[i]);
				hashmap.put(arr[i], (val + 1));
			}
			
			else
			{
				hashmap.put(arr[i], 1);
				count++;
			}
			
			if(count > max)
				max = count;
		}
		
		System.out.println(max);
		in.close();
	}
}
