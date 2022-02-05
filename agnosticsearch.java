//Agnostic search ie. you are unaware of the fact if the array is sorted in ascending order or descending order

import java.util.*;
public class agnosticsearch 
{
    public static int bs1 (int arr[],int n, int x)
    {
        int start=0;
        int end=n-1;
        while(start<=end)
        {
            int mid= start+((start+end)/2);
            if(arr[mid]==x)
            return mid;
            else if(x<arr[mid])
            end=mid-1;
            else  
            start=mid+1;
        }
        return -1;
    }
    public static int bs2 (int arr[],int n, int x)
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
        int b=0;
        if(arr.length==1)
        {
            if(arr[0]==x)
            System.out.println("Element found at index 0");
            else
            System.out.println("Element not present in array");
        }
        else
        {
            if(arr[0]>arr[1])
            b=bs2(arr,n,x);
            else
            b=bs1(arr,n,x);
        }
        if(b==-1)
        System.out.println("Element not found");
        else
        System.out.println("Element found at index "+b);
        
        
    
    }
}