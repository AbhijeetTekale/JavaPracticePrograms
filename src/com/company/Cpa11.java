import java.util.*;

public class Cpa12 {
    public static void main(String[] args) {
        Ship s[] = new Ship[4];
        Scanner sc = new Scanner(System.in);
        int shipId,age;
        String shipName,port,company;
        for(int i=0;i<4;i++)
        {
            shipId = sc.nextInt();
            sc.nextLine();
            shipName = sc.nextLine();
            age = sc.nextInt();
            sc.nextLine();
            port = sc.nextLine();
            company = sc.nextLine();
            s[i] = new Ship(shipId,shipName,age,port,company);
        }
        String inPort = sc.nextLine();
        String inCompany = sc.nextLine();
        int oldShip = findOldestShipByPort(s,inPort);
        if(oldShip==0)
            System.out.println("No such ship in the given port");
        else
            System.out.println(oldShip);
        ArrayList<Ship> ar = findShipsByCompany(s,inCompany);
        if(ar.size()==0)
            System.out.println("No such ship made by the given company");
        else
        {
            int outage[] = new int[ar.size()];
            for(int i= 0;i<ar.size();i++)
            {
                outage[i] = ar.get(i).getShipid();
            }
            Arrays.sort(outage);
            for(int i = outage.length-1;i>=0;i--)
                System.out.println(outage[i]+ "");
        }

    }
    public static int findOldestShipByPort(Ship s[],String port){
        int out=0;
        for(Ship a:s)
        {
            if(a.getPort().equalsIgnoreCase(port))
            {
                if(out<a.getAge())
                    out = a.getAge();
            }
        }
        return out;
    }
    public static ArrayList<Ship> findShipsByCompany(Ship s[], String company)
    {
        ArrayList<Ship> arr = new ArrayList<Ship>();
        for(Ship a:s)
        {
            if(a.getCompany().equalsIgnoreCase(company))
                arr.add(a);
        }
        return arr;
    }
}
class Ship{
    private int shipid;
    private String shipName;
    private int age;
    private String port;
    private String company;

    public Ship(int shipid, String shipName, int age, String port, String company) {
        this.shipid = shipid;
        this.shipName = shipName;
        this.age = age;
        this.port = port;
        this.company = company;
    }

    public int getShipid() {
        return shipid;
    }

    public int getAge() {
        return age;
    }

    public String getPort() {
        return port;
    }

    public String getCompany() {
        return company;
    }

}
