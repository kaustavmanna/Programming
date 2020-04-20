/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9, Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
*/

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum
{
    public static void main(String[] args)
    {
        /*Initialization*/
        int nums[] = new int[] {2, 7, 11, 15};
        int target = 9;

        int result[] = twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);
    }

    public static int[] twoSum(int[] nums, int target)
    {
        int arr[] = new int[2];
        HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++)
        {
            if(hashmap.containsKey(target - nums[i]))
                return new int[]{i, hashmap.get(target - nums[i])};
            hashmap.put(nums[i], i);
        }
        return arr;
    }
}
