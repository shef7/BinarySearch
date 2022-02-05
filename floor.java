//finding the floor of an elemnt in array

import java.util.*;
public class floor
{
    public static int bs (int arr[],int n, int x)
    {
        int start=0;
        int end=n-1;
        int res=0;
        while(start<=end)
        {
            int mid= (start+end)/2;
            if(arr[mid]==x)
            res=mid;
            else if(arr[mid]<x)
            {
                res=arr[mid];
                start=mid+1;
            }
            else  
            end=mid-1;
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
        int a=bs(arr,n,x);
        System.out.println(" Floor of element is  "+a);
        
        
    
    }
}