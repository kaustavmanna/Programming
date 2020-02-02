package com.string;

import java.util.*;

public class SubSequence
{
    private static ArrayList<String> subsequence = new ArrayList<String>();
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        findsubsequence(s, "");

        for(int i = 0; i < subsequence.size(); i++)
            System.out.print(subsequence.get(i) + " ");
        System.out.println();
    }

    private static void findsubsequence(String mainstring, String sub)
    {
        if(mainstring.length() == 0)
        {
            subsequence.add(sub);
            return;
        }

        findsubsequence(mainstring.substring(1), sub+mainstring.charAt(0));
        findsubsequence(mainstring.substring(1), sub);
    }
}
