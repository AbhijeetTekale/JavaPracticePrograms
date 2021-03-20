package com.company;
import java.util.*;
class MyClass{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag=0;
        int sq = n*n;
        while(n%10>0)
        {
            if((n%10)!=(sq%10)) {
                flag=1;
                break;
            }
            else{
                n=n/10;
                sq = sq/10;
            }
        }
        if(flag==0)
            System.out.print("Correct Number");
        else
            System.out.print("Incorrect Number");
    }
}
