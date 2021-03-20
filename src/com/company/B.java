package com.company;
import java.util.Scanner;
import java.util.ArrayList;

class B
{
    public static void main(String ar[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int in[] = new int[n];
        int count = 1;
        for(int i=0;i<n;i++)
        {
            in[i] = sc.nextInt();
        }
        int n1 = sc.nextInt();
        //System.out.println("n1 "+n1);
        int[][] in1 = new int[n1][2];
        for(int i=0;i<n;i++)
        {
            in1[i][0] = sc.nextInt();
            in1[i][1] = sc.nextInt();
            //System.out.println("i "+i+" "+in1[i][0]+" "+in1[i][1]);
        }
    }
}