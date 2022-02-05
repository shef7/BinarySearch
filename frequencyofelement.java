//finding the frequency  of the elemnt in the array

import java.util.*;
public class frequencyofelement
{
    public static int bs1(int[] arr,int n, int x)
    {
        int start = 0;
        int end = n - 1;
         int res = -1;
         while (start <= end)
        {
            int mid = (start + end) / 2;
            if (x == arr[mid])
            {
                res = mid;
                end = mid - 1;
            }
            else if (x < arr[mid])
             {
                end = mid - 1;
            }
            else
             {
                start = mid + 1;
            }
        }
        return res;
    }   
    public static int bs2(int[] arr,int n, int x)
    {
        int start = 0;
        int end = n - 1;
         int res = -1;
         while (start <= end)
        {
            int mid = (start + end) / 2;
            if (x == arr[mid])
            {
                res = mid;
                start = mid + 1;
            }
            else if (x < arr[mid])
             {
                end = mid - 1;
            }
            else
             {
                start = mid + 1;
            }
        }
        return res;
    }   
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements of array");
        for(int i=0;i<arr.length;i++)
        arr[i]=sc.nextInt();
        System.out.println("Enter element to be searched :");
        int x=sc.nextInt();
        int a=bs2(arr,n,x)-bs1(arr,n,x);
        System.out.println("Frequency of element is  "+ (a+1));
        
        
    
    }
}