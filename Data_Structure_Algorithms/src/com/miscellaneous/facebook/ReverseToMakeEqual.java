/* Given two arrays A and B of length N, determine if there is a way to make A equal to B by reversing any subarrays from array B any number of times.

   Signature
   bool areTheyEqual(int[] arr_a, int[] arr_b)

   Input
   All integers in array are in the range [0, 1,000,000,000].

   Output
   Return true if B can be made equal to A, return false otherwise.

   Example
   A = [1, 2, 3, 4]
   B = [1, 4, 3, 2]
   output = true
   After reversing the sub array of B from indices 1 to 3, array B will equal array A.
*/

package com.miscellaneous.facebook;

import java.util.Scanner;

public class ReverseToMakeEqual
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];

        for(int i = 0; i < n; i++)
            a[i] = in.nextInt();

        for(int i = 0; i < n; i++)
            b[i] = in.nextInt();

        boolean matching = false;
        for(int i = 0; i < n; i++)
        {
            if(a[i] == b[i])
            {
                matching = true;
                continue;
            } 
        }
    }
}
