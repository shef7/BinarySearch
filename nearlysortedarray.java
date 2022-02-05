//search an element in a neraly sorted array

import java.util.*;
public class nearlysortedarray 
{
    public static int bs (int arr[],int n, int x)
    {
        int start=0;
        int end=n-1;
        while(start<=end)
        {
            int mid= (start+end)/2;
            if(arr[mid]==x)
            return mid;
            else if(x==arr[mid-1]&& (mid-1)>=start)
            return mid-1;
            else if(x==arr[mid+1]&& (mid+1)>=end) 
            return mid+1;
            else if(x<arr[mid])
            end=mid-2;
            else 
            start=mid+2;
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
