/*
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:
Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.

Follow up:If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
*/

public class MaximumSubArray
{
    public static void main(String[] args)
    {
        int[] nums = new int[]{1, 15, -2, 3, 4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums)
    {
        int sum = nums[0];
        int maxsum = nums[0];
        for(int i = 1; i < nums.length; i++)
        {
            sum = Math.max(nums[i], sum + nums[i]);
            maxsum = Math.max(sum, maxsum);
        }
        return maxsum;
    }
}