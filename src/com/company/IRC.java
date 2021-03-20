package com.company;
import java.util.*;

public class IRC {
    public static void main(String[] args) {
        Appliance[] appliance = new Appliance[4];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<4;i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String category = sc.nextLine();
            double price = sc.nextDouble();
            appliance[i] = new Appliance(id, name, category, price);
        }
        String category;
        int id = sc.nextInt();
        boolean insurance = sc.nextBoolean();
        sc.nextLine();
        category = sc.nextLine();
        double amount = getAmount(appliance,id,insurance);
        System.out.println(amount);

        Appliance appl = getCostliestAppliance(appliance,category);
        if(appl != null)
        {
            System.out.println("id "+appl.getId());
            System.out.println("Name "+appl.getName());
            System.out.println("Price :"+appl.getPrice());
        }
    }

    private static Appliance getCostliestAppliance(Appliance[] appliance, String category) {
        Appliance appliance1=appliance[0];
        double max=0,temp;
        for(Appliance a:appliance)
        {
            if(a.getCategory().equals(category))
            {
                temp = a.getPrice();
                if(max<temp)
                    appliance1 = a;
            }
        }
        return appliance1;
    }

    private static double getAmount(Appliance[] appliance, int id, boolean insurance) {
        double p=0;
        for(Appliance a:appliance)
        {
            if(a.getId()==id) {
                p = a.getPrice()*1.2;
                a.setPrice(p);
            }
        }
        return p;
    }
}
class Appliance{
    private int id;
    private String name;
    private String category;
    private double price;
    private boolean insurance;

    public Appliance(int id, String name, String category, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInsurance() {
        return insurance;
    }

}
