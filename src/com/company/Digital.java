package com.company;
import java.util.Scanner;
public class Digital {
    public static void main(String ar[])
    {
        int n,v,op=0;
        Scanner sc= new Scanner(System.in);
        n=Integer.valueOf(sc.nextLine());
        v=Integer.valueOf(sc.nextLine());
        String val[] = new String[v];
        for(int i=0;i<v;i++)
        {
            val[i] = sc.nextLine();
        }
        int temp=n*n;
        for(int i=0;i<v;i++)
        {
            if(val[i].equalsIgnoreCase("RIGHT")&& op%n!=(n-1))
                op = op + 1;
            if(val[i].equalsIgnoreCase("LEFT")&& op%n!=0)
                op=op-1;
            if(val[i].equalsIgnoreCase("DOWN")&&op+n<temp)
                op=op+n;
            if(val[i].equalsIgnoreCase("UP")&&op-n>=0)
                op=op-n;
        }
        System.out.print(op);
    }

}
