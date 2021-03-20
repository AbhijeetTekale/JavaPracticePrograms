package com.company;
import java.util.*;
class Test{
    public static void main(String ar[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(s.charAt(0)>='A'&&s.charAt(0)<='Z')
            System.out.println("UPPER ALPHABET");
        if(s.charAt(0)>='a'&&s.charAt(0)<='z')
            System.out.println("LOWER ALPHABET");
        else if(s.charAt(0)>='0'&&s.charAt(0)<='9')
            System.out.println("NUMBER");
        else
            System.out.println("SYMBOL");
    }
}