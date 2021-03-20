package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class SortClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Data> v1 = new ArrayList<Data>();
        for(int i=0;i<3;i++)
        {
            int id =sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            int Amount = sc.nextInt();
            Data d = new Data(id,name,Amount);
            v1.add(d);
        }
        Collections.sort(v1,new sortByAmount());
        for(int i=0;i<3;i++)
        {
            Data d = v1.get(i);
            System.out.println("Id : "+d.getId()+" Name : "+d.getName()+" Amount : "+d.getAmount());
        }
    }
}
class sortByAmount implements Comparator<Data> {

    @Override
    public int compare(Data o1, Data o2) {
        if(o1.getAmount()==o2.getAmount())
            return(o1.getName().compareTo(o2.getName()));
        return o1.getAmount()-o2.getAmount();
    }
}
class Data{
    private int id;
    private String name;
    private int Amount;
    public Data(int id,String name,int Amount) {
        this.id = id;
        this.name = name;
        this.Amount = Amount;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int amount) {
        Amount = amount;
    }
}
