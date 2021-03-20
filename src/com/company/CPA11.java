package com.company;
import java.util.*;

public class CPA11 {
    public static void main(String[] args) {
        Package p[] = new Package[5];
        Scanner sc = new Scanner(System.in);
        int invoice;
        String from,to,orderDate,deliveryDate;
        Double price;
        for(int i=0;i<5;i++)
        {
            invoice = sc.nextInt();
            sc.nextLine();
            from = sc.nextLine();
            to = sc.nextLine();
            orderDate = sc.nextLine();
            deliveryDate = sc.nextLine();
            price = sc.nextDouble();
            p[i] = new Package(invoice,from,to,orderDate,deliveryDate,price);
        }
        sc.nextLine();
        String city1 = sc.nextLine();
        String city2 = sc.nextLine();

        int orders = countOrders(p,city1);
        if(orders>0)
            System.out.println(orders);
        else
            System.out.println("No such orders");
        Package p1 = searchPackage(p,city2);
        if(p1 == null)
        {
            System.out.println("No package found");
        }
        else
            System.out.println(p1.getInvoice()+"\n"+p1.getPrice());
    }

    private static Package searchPackage(Package[] p, String city2) {
        ArrayList<Double> pri = new ArrayList<>();
        for (Package p1 : p) {
            if(city2.equalsIgnoreCase(p1.getTo()))
                pri.add(p1.getPrice());
        }
        Collections.sort(pri);
        if(pri.size()>1)
            for(Package p1:p){
                double pr = pri.get(pri.size()-2);
                if(pr==p1.getPrice())
                    return p1;
            }
        else
            return null;
        return null;
    }

    private static int countOrders(Package[] p, String city1) {
        int count=0;
        for(int i=0;i<5;i++)
        {
            String city = p[i].getFrom();
            if(city.equalsIgnoreCase(city1)) {

                int d1 = Integer.valueOf(p[i].getDeliveryDate());
                int d2 = Integer.valueOf(p[i].getOrderDate());
                if (Math.abs(d1 - d2) > 7)
                    count++;
            }
        }
        return count;
    }
}
class Package{
    private int invoice;
    private String from,to,orderDate,deliveryDate;
    Double price;
    public Package(int invoice, String from, String to, String orderDate, String deliveryDate, Double price) {
        this.invoice = invoice;
        this.from = from;
        this.to = to;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.price = price;
    }

    public int getInvoice() {
        return invoice;
    }

    public String getFrom() {
        return from;
    }

    public String getOrderDate() {
        return orderDate.substring(0,2);
    }

    public String getDeliveryDate() {
        return deliveryDate.substring(0,2);
    }


    @Override
    public String toString() {
        return "Package{" +
                "invoice=" + invoice +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", orderDate='" + orderDate + '\'' +
                ", deliveryDate='" + deliveryDate + '\'' +
                ", price=" + price +
                '}';
    }

    public String getTo() {
        return to;
    }

    public Double getPrice() {
        return price;
    }
}
