    import java.util.*;
    import java.io.*;

class Solution{
    public static void main(String ar[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> val = new ArrayList();
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++)
        {
            val.add(0);
        }
        n = (n*(n-1))/2;
        for(int i=0;i<n;i++)
        {
            String in = br.readLine();
            String set[] = in.split(" ");
            String va[] = set[2].split("-");
            if(Integer.valueOf(va[0])==Integer.valueOf(va[1]))
            {
                val.set(Integer.valueOf(set[0].charAt(0))-65,val.get(Integer.valueOf(set[0].charAt(0))-65)+1);
                val.set(Integer.valueOf(set[1].charAt(0))-65,val.get(Integer.valueOf(set[1].charAt(0))-65)+1);
            }
            else if(Integer.valueOf(va[0])>Integer.valueOf(va[1]))
            {
                int pos = Integer.valueOf(set[0].charAt(0))-65;
                val.set(pos,val.get(Integer.valueOf(set[0].charAt(0))-65)+3);
            }
            else {
                int pos = Integer.valueOf(set[1].charAt(0)) - 65;
                val.set(pos, val.get(Integer.valueOf(set[1].charAt(0)) - 65) + 3);
            }
        }
        int flag=0,max=val.get(0),i=0;

        for(i=0;i<val.size();i++)
        {

            if(val.get(i)>max)
            {
                flag = i;
            }
        }
        System.out.println((char)(65+flag));
        System.out.print(val.get(flag));
    }
}