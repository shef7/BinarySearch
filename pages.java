//minimize the maximum number of pages read by a student

import java.util.*;
public class pages
 {
     public static int max(int arr[])
     {
         int m=arr[0];
         for(int i=1;i<arr.length;i++)
         {
             if(m>arr[i])
             m=arr[i];
         }
         return m;
     }
     public static int sum(int arr[])
     {
         int s=0;
         for(int i=0;i<arr.length;i++)
         s+=arr[i];
         return s;
     }
     public static boolean isvalid(int arr[],int n,int k,int max)
     {
         int student=1;
         int sum=0;
         for(int i=0;i<n;i++)
         {
             sum+=arr[i];
             if(sum>max)
             {
                 student++;
                 sum=arr[i];
             }
             if(student>k)
             return false;
         }
         return true;
     }

     public static int bs(int arr[],int n,int k)
    {
        int m=max(arr);
        int start=max(arr);
        int end=sum(arr);
        int res=-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(isvalid(arr,n,k,m)==true)
            {
                res=mid ;
                end=mid-1;
            }
            else
            start=mid+1;
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
        System.out.println("Enter number of students:");
        int x=sc.nextInt();
        int a=bs(arr,n,x);
        System.out.println("minimum number of pages is  "+a);
        
        
    
    }
    
 }