/*
There are two sorted arrays nums1 and nums2 of size m and n respectively.
Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
You may assume nums1 and nums2 cannot be both empty.

Example 1:
nums1 = [1, 3]
nums2 = [2]
The median is 2.0

Example 2:
nums1 = [1, 2]
nums2 = [3, 4]
The median is (2 + 3)/2 = 2.5
*/

public class MedianSortedArrays
{
    public static void main(String[] args)
    {
        int[] nums1 = new int[]{1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int[] nums2 = new int[]{2};

        System.out.println("Median of sorted arrays is: " + findmedian(nums1, nums2));
    }

    public static double findmedian(int nums1[], int nums2[])
    {
        int index = 0;
        int total_length = nums1.length + nums2.length;
        if((nums1.length + nums2.length) % 2 != 0)
            total_length++;
        int nums1_position = 0, nums2_position = 0;

        int mid1 = 0, mid2 = 0;
        while(index < (total_length / 2) && nums1_position < nums1.length && nums2_position < nums2.length)
        {
            if(nums1_position < nums1.length && nums1[nums1_position] < nums2[nums2_position])
            {
                mid1 = nums1[nums1_position++];
                index++;
            }
            else if(nums2_position < nums2.length && nums2[nums2_position] < nums1[nums1_position])
            {
                mid1 = nums2[nums2_position++];
                index++;
            }
        }

        while(index < (total_length / 2))
        {
            if(nums1_position < nums1.length)
            {
                mid1 = nums1[nums1_position++];
                index++;
            }
            else if(nums2_position < nums2.length)
            {
                mid1 = nums2[nums2_position++];
                index++;
            }
        }

        if((nums1.length + nums2.length) % 2 != 0)
            return (double) mid1;
        else
        {
            if(nums1_position < nums1.length && nums1[nums1_position] < nums2[nums2_position])
                mid2 = nums1[nums1_position];
            else
                mid2 = nums2[nums2_position];
        }
        return ((double) mid1 + (double) mid2) / 2;
    }
}
