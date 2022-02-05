//find the position of the first 1 in a binary sorted array

import java.util.*;
public class binarysortedarray
 {
      public static int inf(int arr[],int n )
      {
          int start =0;
          int end=1;
          int x=1;
          while(x>arr[end])
          {
              start=end;
              end=end*2;
          }
          return bs(arr,start,end);
      }
      public static int bs (int arr[],int start,int end)
    {
       
        int res=-1;
        int x=1;
        while(start<=end)
        {
            int mid= start+((start+end)/2);
            if(arr[mid]==x)
            {
                res=mid;
                end=mid-1;
            }
            else if(x<arr[mid])
            end=mid-1;
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
          int a=inf(arr,n);
          System.out.println(" First occurence of 1 is  "+a+1);
      }   
}
