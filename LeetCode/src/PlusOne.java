/*
Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:
Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.

Example 2:
Input: [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
*/

public class PlusOne
{
    public static void main(String[] args)
    {
        int digits[] = new int[] {9, 8};
        int plusone[] = plusOne(digits);
        for(int i:plusone)
            System.out.print(i);
    }

    public static int[] plusOne(int[] digits)
    {
        if(digits[digits.length-1] != 9)
        {
            digits[digits.length-1]++;
            return digits;
        }
        else
        {
            digits[digits.length-1] = 0;
            int cf = 1;
            for(int i = digits.length-2; i >= 0; i--)
            {
                if((digits[i] + cf) == 10)
                {
                    digits[i] = 0;
                    cf = 1;
                }
                else
                {
                    digits[i] = digits[i] + cf;
                    cf = 0;
                    break;
                }
            }

            if(cf == 0)
                return digits;
            else
            {
                int arr[] = new int[digits.length+1];
                arr[0] = cf;
                for(int i = 1; i < arr.length; i++)
                    arr[i] = digits[i-1];
                return arr;
            }
        }
    }
}
