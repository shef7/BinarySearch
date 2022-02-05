//find how many times a array is rotated

import java.util.*;
public class rotatedarray 
{
    public static int bs (int arr[],int n)
    {
        int start=0;
        int end=n-1;
        while(start<=end)
        {
            if (arr[start] <= arr[end])
             {
                return start;
            }
            int mid= (start+end)/2;
            int next =(mid+1)%n; //to avoid index out of bound mod it by n
            int prev =(mid+n-1)%n; // to avoid negative index substract by n
            if(arr[mid]<=arr[next] && arr[mid] <=arr[prev])
             return mid;
             else if(arr[start]<arr[mid])
            start=mid+1;
            else if(arr[mid]<=arr[end])
            end=mid-1;
            

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
        System.out.println("Array is rotated  "+a +"times");
        
        
    
    }
    
}
