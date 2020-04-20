package com.miscellaneous;

public class GetHappyString
{
    public static void main(String[] args)
    {
        int n = 3;
        int k = 9;
        String result = "";
        if(gethappystring(n,k))
        {
            if(k <= (int) Math.pow(2,n-1))
                result = result + "a";
            else if(k <= (int) 2 * Math.pow(2,n-1))
                result = result + "b";
            else
                result = result + "c";

            int i =2;
            while(i <= n)
            {

            }
        }
    }

    public static boolean gethappystring(int n, int k)
    {
        int possible_combination = (int) Math.pow(2, n-1) * 3;
        if (possible_combination < k)
            return false;
        else
            return true;
    }
}
