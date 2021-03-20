package com.company;
import java.util.Arrays;
import java.util.Scanner;
class H
{
    public static void main(String ar[])
    {
        Scanner sc = new Scanner(System.in);
        String in1 = sc.nextLine();
        String in2 = sc.nextLine();
        String s[] = in1.split(" ");
        //Arrays.stream(s).distinct();
        int n = s.length,n_Str=0,n_Str1=0;
        for(int i=0;i<n;i++)
        {
            if(s[i].contains(in2))
            {
                //System.out.println(s[i]+" 1");
                for(int j=0;j<s[i].length();j++)
                {
                    if(s[i].charAt(j)==in2.charAt(0))
                        n_Str++;
                }
            }
            else if(s[i].contains(String.valueOf(in2.charAt(0))))
                for(int j=0;j<s[i].length();j++)
                {
                    if(s[i].charAt(j)==in2.charAt(0)) {
                        //System.out.println(s[i]+"2");
                        n_Str++;
                    }
                }
            else if(s[i].contains(String.valueOf(in2.charAt(1))))
                for(int j=0;j<s[i].length();j++)
                {

                    if(s[i].charAt(j)==in2.charAt(1)) {
                        // System.out.println(s[i]+"3");
                        n_Str++;
                    }
                }

        }
        System.out.print(n_Str-1);
    }

}


