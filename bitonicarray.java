//find the max element in the bitonic array 

import java.util.*;
public class bitonicarray 
{
    public static int bs (int arr[],int n)
    {
        int start=0;
        int end=n-1;
        while(start<=end)
        {
            int mid= ((end-start)/2)+start;
            if(mid>0&&mid<n-1)
            {
                if((arr[mid]>arr[mid-1]) &&  (arr[mid]>arr[mid+1]))
                return mid;
                else if(arr[mid]<arr[mid-1])
                end=mid-1;
                else 
                start=mid+1;
            }
            else if (mid==0)
            {
                if(arr[0]>arr[1])
                return 0;
                else
                return 1;
            }
            else if(mid==n-1)
            {
                if(arr[n-1]>arr[n-2])
                return n-1;
                else
                return n-2;

            }
        }
        return -1;

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
        int a=bs(arr,n);
        System.out.println("The max  element in bitonic array is "+arr[a]);
    }
}
