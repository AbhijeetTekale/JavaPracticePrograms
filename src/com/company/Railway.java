package com.company;

import java.util.*;
class Railway{
  public static void main(String ar[])
  {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int arrival[] = new int[n];
     int stop[] = new int[n];
     int depart[] = new int[n];
     int i=0,j=0,count=0;
     for(i=0;i<n;i++)
     {
       arrival[i] = sc.nextInt();
       stop[i] = sc.nextInt();
       depart[i] = arrival[i] + stop[i];
     }
     int temp=0;
     Arrays.sort(arrival);
     Arrays.sort(depart);
     j=0;
     for(i=0;i<n;i++)
     {
       if(depart[j]<arrival[i])
       {
         temp++;
         j++;
       }
     }
     count=n-j;
     System.out.print(count);
   }
}






