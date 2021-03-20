package com.company;
import java.util.Arrays;
import java.lang.System.*;
import java.util.Scanner;
import java.math.*;

import static java.lang.Long.toBinaryString;

public class Case {
    public static void main(String[] args) {
//        int n=55;
//        Long a = (long) Math.pow(2,32);
//        String s = toBinaryString(a);
//        String s1 = toBinaryString(Long.valueOf(n));
//        System.out.println(s);
//        System.out.println(s1);
        int []a = {4,5,3,2,6};
        int []b = {6,7,4};
        int []c =  maxXor(a,b);
        System.out.print(Arrays.toString(c));

    }
    public static int[] maxXor(int []arr,int[]queries)
    {
        int []max = new int[queries.length];
        int temp;
        for(int i=0;i<queries.length;i++)
        {
            max[i] = queries[i]^arr[0];
            for(int j=1;j<arr.length;j++)
            {
                temp = queries[i]^arr[j];
                //System.out.println(temp);
                if(max[i]<temp)
                {
                    max[i]=temp;
                }
            }
           // System.out.println(" ");
        }
        return max;
    }
}

