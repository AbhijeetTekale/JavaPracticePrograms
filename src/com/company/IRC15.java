package com.company;

import java.util.*;

public class IRC15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Voter> v = new ArrayList<Voter>();
        for(int i=0;i<4;i++)
        {
            Voter v1 ;
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            int age = sc.nextInt();
            boolean isVoter = sc.nextBoolean();
            sc.nextLine();
            String cons = sc.nextLine();
            v1 = new Voter(id,name,age,isVoter,cons);
            v.add(v1);
        }
        String constitution = sc.nextLine();
        int n = numberofvoter(constitution,v);
        ArrayList<Voter> va = searchVoter(v);
        if(n>0)
            System.out.println(n);
        else
            System.out.println("No voter casted");
        if(va.size()==0)
        {
            System.out.println("No such voters");
        }
        else{
            for(Voter v4:va)
            {
                System.out.println(v4.getId());
            }
        }
    }

    private static ArrayList<Voter> searchVoter(ArrayList<Voter> v) {
        ArrayList<Voter> v1 = new ArrayList<Voter>();
        for(int i=0;i<4;i++)
        {
            if(v.get(i).getAge()<30)
                v1.add(v.get(i));
        }
        Collections.sort(v1,new Sortbyage());
        return v1;
    }
    private static int numberofvoter(String constitution, ArrayList<Voter> v) {
        int count = 0;
        for(Voter v1:v)
        {
            if(v1.getCons().equals(constitution)){
                if(v1.isVoter())
                    count++;
            }
        }
        return count;
    }
}
class Sortbyage implements Comparator<Voter>
{
    @Override
    public int compare(Voter o1, Voter o2) {
        return o1.getAge()-o2.getAge();
    }
}
class Voter
{
    private int id;
    private String name;
    private int age;
    private boolean isVoter;
    private String cons;

    public Voter(int id,String name,int Age,boolean isVoter,String cons)
    {
        this.id = id;
        this.name = name;
        this.age = Age;
        this.isVoter = isVoter;
        this.cons = cons;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isVoter() {
        return isVoter;
    }

    public void setVoter(boolean voter) {
        isVoter = voter;
    }

    public String getCons() {
        return cons;
    }

    public void setCons(String cons) {
        this.cons = cons;
    }
}


