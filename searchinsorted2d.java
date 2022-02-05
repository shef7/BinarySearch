//search the element in a 2d array which is sorted row wise and coloumn wise

import java.util.*;
public class searchinsorted2d
 {
     public static int[] search(int arr[][],int n,int k)
     {
         int b[]={-1,-1};
         int  i =0;
         int j=n-1;
         while((i>=0 && i<n) && (j>=0 && j< n))
         {
             if(arr[i][j]==k)
             {
                 b[0]=i;
                 b[1]=j;
                
             }
             else if(arr[i][j]>k)
             j--;
             else 
             i++;
         }
         return b;
     }
     public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        System.out.println("Enter elements of array");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter element to be searched :");
        int x=sc.nextInt();
        int b[]=new int[2];
        b=search(arr,n,x);
        if(b[0]==-1)
        System.out.println("Element not found");
        else
        System.out.println("Element found at index "+ b);
        

    
}
 }