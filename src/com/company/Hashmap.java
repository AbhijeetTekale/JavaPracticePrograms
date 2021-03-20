package com.company;


import java.util.*;

public class Hashmap {
    public static void main(String ar[])
    {
        Map<Integer,String> hmap = new HashMap<Integer,String>();
        Scanner sc = new Scanner(System.in);
        int flag=1;
        while(flag==1)
        {
            flag = sc.nextInt();
            switch (flag)
            {
                case 1:
                    int key = sc.nextInt();
                    String val = sc.nextLine();
                    hmap.put(key,val);
                    break;
                case 2:
                    flag = 2;
            }
        }
        System.out.println(hmap);
        TreeMap<Integer,String> tmap = new TreeMap<>(hmap);
        List<Map.Entry<Integer,String>> lmap = new LinkedList<Map.Entry<Integer, String>>(hmap.entrySet());
        Collections.sort(lmap, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return ((o1.getKey()).compareTo(o2.getKey()));
            }
        });
        System.out.println(tmap);
        System.out.println(lmap);
    }
}