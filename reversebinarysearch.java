//Binary search on the array sorted in descending order or reverse order

import java.util.*;
public class reversebinarysearch 
{
    public static int bs (int arr[],int n, int x)
    {
        int start=0;
        int end=n-1;
        while(start<=end)
        {
            int mid= start+((start+end)/2);
            if(arr[mid]==x)
            return mid;
            else if(x>arr[mid])
            end=mid-1;
            else  
            start=mid+1;
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
        System.out.println("Enter element to be searched :");
        int x=sc.nextInt();
        int a=bs(arr,n,x);
        if(a==-1)
        System.out.println("Element not found");
        else
        System.out.println("Element found at index "+a);
        
        
    
    }
}