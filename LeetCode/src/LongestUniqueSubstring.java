/*
Given a string, find the length of the longest substring without repeating characters.

Example 1:
Input: "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:
Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:
Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
*/

import java.util.HashSet;
import java.util.Scanner;

public class LongestUniqueSubstring
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println("Maximum length of unique substring: " + findlongesetuniquesubstring(s));
    }

    public static int findlongesetuniquesubstring(String s)
    {
        HashSet<Character> hashSet = new HashSet<Character>();
        int max_length = 0;
        int j = 0;

        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            while(hashSet.contains(c))
                hashSet.remove(s.charAt(j++));
            hashSet.add(c);
            max_length = Math.max(max_length, hashSet.size());
        }
        return max_length;
    }
}
