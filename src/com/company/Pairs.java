package com.company;
import java.util.*;
class Pairs {
  	public static void main(String ar[])
    {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      int count=0,i;
      int arr[] = new int[n];
      for(i=0;i<n;i++)
      {
        arr[i] = sc.nextInt();
      }
      for(i=0;i<n;i++)
      {
        count = count + isHappy(arr[i]-k,arr[i]+k,arr,i); 
      }
      System.out.print(count);
    }
  	public static int isHappy(int l,int h,int ar[],int position)
    {
      for(int j=0;j<ar.length;j++)
      {
        if(j!=position)
        {
          if((ar[j]>=l) && (ar[j]<= h))
          {
            return 1;
         }
        }
      }
      return 0;
    }
}
