package com.company;
import java.util.*;

public class MyClass {
    public static void main(String[] args) {
        int fanId;
        String fanName;
        String fanCompany;
        double fanPrice;
        int fanSold;
        Fan f[] = new Fan[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            fanId = sc.nextInt();
            sc.nextLine();
            fanName = sc.nextLine();
            fanCompany = sc.nextLine();
            fanPrice= sc.nextDouble();
            fanSold = sc.nextInt();

            f[i] = new Fan(fanId,fanName,fanCompany,fanPrice,fanSold);
        }
        sc.nextLine();
        String in1 = sc.nextLine();
        String in2 = sc.nextLine();
        double d = avgSoldByCompany(f,in1);
        if(d==0)
            System.out.println("Invalid Company");
        else
            System.out.println(d);
        ArrayList<Fan> f3 = getAscending(f,in2);
        if(f3.size()==0)
            System.out.println("Invalid Company");
        else
            for(Fan fan:f3){
                System.out.println(fan.getFanId()+" "+fan.getFanName()+" "+fan.getFanPrice());
            }
    }
    public static double avgSoldByCompany(Fan f[],String str){
        int count=0;
        int sum=0;
        for(Fan f1:f) {
            if (f1.getFanCompany().equalsIgnoreCase(str)) {
                count++;
                sum += f1.getFanSold();
            }
        }
        if(sum>0)
            return(sum/Double.valueOf(count));
        else
            return 0;
    }
    public static ArrayList<Fan> getAscending(Fan f[],String str)
    {
        ArrayList<Fan> f1 = new ArrayList<>();
        for(Fan f2:f) {
            if (f2.getFanCompany().equalsIgnoreCase(str)) {
                f1.add(f2);
            }
        }
        Collections.sort(f1,new sortByPrice());
        return f1;
    }
}
class sortByPrice implements Comparator<Fan>{

    @Override
    public int compare(Fan o1, Fan o2) {
        return (int)(o1.getFanPrice() - o2.getFanPrice());
    }
}

class Fan{
    private int fanId;
    private String fanName;
    private String fanCompany;
    private double fanPrice;
    private int fanSold;

    public int getFanId() {
        return fanId;
    }
    

    public String getFanName() {
        return fanName;
    }

    public String getFanCompany() {
        return fanCompany;
    }

    
    public double getFanPrice() {
        return fanPrice;
    }

  
    public int getFanSold() {
        return fanSold;
    }
    

    public Fan(int fanId, String fanName, String fanCompany, double fanPrice, int fanSold) {
        this.fanId = fanId;
        this.fanName = fanName;
        this.fanCompany = fanCompany;
        this.fanPrice = fanPrice;
        this.fanSold = fanSold;
    }
}


