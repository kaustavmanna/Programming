/**
 * @author kaustavmanna
 *
 */

/*Count number of anagrams in the String*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Problem_6
{
    public static void main(String[] args)
    {
        /*Standard Input*/
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String comp_str = in.next();

        /*List to contain the matching indexes*/
        List<Integer> matchingindex = new ArrayList<Integer>();
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        HashMap<String, Integer> hashMap2 = new HashMap<String, Integer>();
        int comp_str_length = comp_str.length();

        /*Inserting all the elements of comparing string in the hashmap*/
        for(int i = 0; i < comp_str_length; i++)
        {
            String sub_anagram = comp_str.substring(i, i + 1);
            if(hashMap.containsKey(sub_anagram))
                hashMap.put(sub_anagram,hashMap.get(sub_anagram)+1);
            else
                hashMap.put(sub_anagram,1);
        }
        HashMap<String, Integer> cloned_hashMap = (HashMap<String, Integer>) hashMap.clone();

        /*Comparing with the main String*/
        for (int i = 0; i <= str.length() - comp_str_length; i++)
        {
            if(i == 0)
            {
                for(int j = 0; j < comp_str_length; j++)
                {
                    String sub_str = str.substring(i+j, i+j+1);
                    if(hashMap.containsKey(sub_str))
                    {
                        if(hashMap.get(sub_str) == 1)
                            hashMap.remove(sub_str);
                        else
                            hashMap.put(sub_str, hashMap.get(sub_str)-1);
                    }
                }
            }

            else
            {
                String prev_sub_str = str.substring(i-1,i);
                String next_sub_str = str.substring(i+comp_str_length-1,i+comp_str_length);

                /*Previous element removal from the Hashmap calculation*/
                if(cloned_hashMap.containsKey(prev_sub_str))
                {
                    if(hashMap.containsKey(prev_sub_str))
                    {
                        if(hashMap.get(prev_sub_str) == -1)
                            hashMap.remove(prev_sub_str);
                        else
                            hashMap.put(prev_sub_str, hashMap.get(prev_sub_str) + 1);
                    }
                    else
                        hashMap.put(prev_sub_str,1);
                }

                /*Next element inclusion in the Hashmap calculation*/
                if(cloned_hashMap.containsKey(next_sub_str))
                {
                    if(hashMap.containsKey(next_sub_str))
                    {
                        if (hashMap.get(next_sub_str) == 1)
                            hashMap.remove(next_sub_str);
                        else
                            hashMap.put(next_sub_str, hashMap.get(next_sub_str) - 1);
                    }
                    else
                        hashMap.put(next_sub_str, -1);
                }
            }
            if(hashMap.size() == 0)
                matchingindex.add(i);
        }
        for(Integer i:matchingindex)
            System.out.print(i + " ");
    }
}