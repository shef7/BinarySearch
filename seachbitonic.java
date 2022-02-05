//find the  element in the bitonic array 

import java.util.*;
public class seachbitonic 
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
    public static int bs1 (int arr[],int start, int end,int x)
    {
        
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
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements of array");
        for(int i=0;i<arr.length;i++)
        arr[i]=sc.nextInt();
        System.out.println("Enter the element to be searched");
        int x=sc.nextInt();
        int a=bs(arr,n);
        int b=bs1(arr,0,a,x);
        int c=bs1(arr,a-1,n-1,x);
        if(b!=-1)
        System.out.println("The element is present at index "+b);
        else if(c!=1)
        System.out.println("The element is present at  index  "+c);
        else
        System.out.println("The elemnt not found");
    }
}
