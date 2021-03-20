package com.company;
import java.util.Scanner;
import java.util.regex.*;

public class Regex {
    public static void main(String ar[])
    {
        Pattern p = Pattern.compile("a ");
        Matcher matcher = p.matcher("Abhijeet bhagwan tekale");
        if(matcher.find())
            System.out.print(matcher.groupCount());
        else
            System.out.print("Match not found");
    }
}

