package com.company;
import java.util.*;
import java.lang.*;
public class CPA25 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Bicycle[] bicycles = new Bicycle[4];
        for(int i=0; i<bicycles.length; i++){
            String bicycleName = s.nextLine();
            String brand = s.nextLine();
            int cost = s.nextInt();
            int age = s.nextInt();
            s.nextLine();
            bicycles[i] = new Bicycle(bicycleName,brand,cost,age);
        }
        String inBrand = s.nextLine();
        int inAge = s.nextInt();
        ArrayList<Bicycle> br = findBicycle(bicycles,inAge);
        if(br==null)
            System.out.println("Bicycle is not available for given Agegroup");
        else
        {
            for(int i=br.size()-1;i>=0;i--)
            {
                System.out.println(br.get(i).getBicycleName());
            }
        }
        int sum = TotalCost(bicycles,inBrand);
        if(sum == 0)
            System.out.println("No Bicycle is available for given brand");
        else
            System.out.println(sum);
    }

    private static int TotalCost(Bicycle[] bicycles, String inBrand) {
        int sum = 0;
        for(Bicycle b:bicycles)
        {
            if(b.getBrand().equalsIgnoreCase(inBrand))
                sum = sum + b.getCost();
        }
        return sum;
    }

    public static ArrayList<Bicycle> findBicycle(Bicycle[] bicycles, int inAge) {
        ArrayList<Bicycle> ar = new ArrayList<Bicycle>();
        for(int i=0;i<4;i++)
        {
            if(bicycles[i].getAge()<=inAge) {
                ar.add(bicycles[i]);
            }
        }
        if(ar.size()==0)
            return null;
        else
        Collections.sort(ar,new SortByCost());
        return ar;
    }


}
class SortByCost implements Comparator<Bicycle>{
    public int compare(Bicycle obj1, Bicycle obj2)
    {
        return (int)(obj1.getCost() - obj2.getCost());

    }
}

class Bicycle{
    private String bicycleName;
    private String brand;
    private int cost;
    private int age;

    public Bicycle(String bicycleName, String brand, int cost, int age) {
        this.bicycleName = bicycleName;
        this.brand = brand;
        this.cost = cost;
        this.age = age;
    }

    public String getBicycleName() {
        return bicycleName;
    }

    public String getBrand() {
        return brand;
    }

    public int getCost() {
        return cost;
    }


    public int getAge() {
        return age;
    }

}