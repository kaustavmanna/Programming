/**
 * @author kaustavmanna
 *
 */

/*Find first occurrence of a number in a sorted repeating array*/
import java.util.Scanner;

public class Problem_7
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int arr[] = {1,1,2,2,2,3,3,3,3,4,4,4,4,4,5,5,5,5,5,5,6,6,6,6,6,6,6,7,7,7,7,7,7,7,7};
        if(arr[0] > n || arr[arr.length-1] < n)
        {
            System.out.println("Not Found!");
            return;
        }
        int index = findindex(arr,0,arr.length-1,n);

        while(index >= 1 && arr[index] == arr[index-1])
            index = findindex(arr,0,index, n);
        System.out.println(index);
    }

    private static int findindex(int arr[], int start, int end, int data)
    {
        int mid = (start + end) / 2;
        if(arr[mid] > data)
            return findindex(arr, start, mid, data);
        else if(arr[mid] < data)
            return findindex(arr,mid+1, end, data);
        else
            return mid;
    }
}
