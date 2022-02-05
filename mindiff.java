//find the minimum difference element in array

import java.util.*;
public class mindiff 
{
    public static int bs (int arr[],int n, int x)
    {
        int start=0;
        int end=n-1;
        while(start<=end)
        {
            int mid= (start+end)/2;
            if(arr[mid]==x)
            return arr[mid];
            else if(x<arr[mid])
            end=mid-1;
            else  
            start=mid+1;
        }
        int c=Math.min(Math.abs(arr[start]-x),Math.abs(arr[end]-x));
        return c;

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
        System.out.println("Minimum difference is  "+a);
        
        
    
    }
}
