package com.company;
import java.util.Scanner;

class G
{
    public static void main(String ar[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int k = sc.nextInt();
        int max = sc.nextInt();
        double[] in1 = new double[n];
        double[] in2 = new double[n];
        for(int i=0;i<n;i++)
        {
            in1[i]=sc.nextDouble();
        }
        for(int i=0;i<n;i++)
        {
            in2[i]=sc.nextDouble();
        }
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                double temp1, temp2;
                if (in2[j] < in2[i]) {
                    temp1 = in2[j];
                    in2[j] = in2[i];
                    in2[i] = temp1;
                    temp2 = in1[j];
                    in1[j] = in1[i];
                    in1[i] = temp2;
                }
            }
        }
        double profit=0;
        for(int i=0;i<k;i++)
        {
            if(i==k-1)
                profit += (k-1)*(in1[i]*in2[i]);
            else
                profit += (k)*(in1[i]*in2[i]);
        }
        System.out.print(Math.round(profit/100));
    }
}
