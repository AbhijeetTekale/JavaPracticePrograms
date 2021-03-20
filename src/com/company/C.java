package com.company;
import java.util.Scanner;

class C
{
    public static void main(String ar[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[][] in1 = new int[n1][n2];
        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<n2;j++)
                in1[i][j]=sc.nextInt();
        }
        int val1 = rowwise(in1,n1,n2);
        int val2 = colwise(in1,n1,n2);
        if(val1<val2)
            System.out.print(val1);
        //else
           System.out.print(val2);
    }
    public static int rowwise(int[][] a,int n1,int n2)
    {
        int count=0;
        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<n2;j++)
            {
                if(a[i][j]==6)
                {
                    while(a[i][j]==6&&j<n2-1) {
                        j++;
                    }
                    count++;
                }
            }
        }
        return count;
    }
    public static int colwise(int[][] a,int n1,int n2)
    {
        int count=0;
        for(int j=0;j<n2;j++)
        {
            for(int i=0;i<n1;i++)
            {
                if(a[i][j]==6)
                {
                    while(a[i][j]==6&&i<n1-1) {
                        i++;
                    }
                    count++;
                }
            }
        }
        return count;
    }
}
