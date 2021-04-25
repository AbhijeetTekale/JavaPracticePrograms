class Solution {
    public int evalRPN(String[] tokens) {
        ArrayList<Integer> in = new ArrayList<Integer>();
        int i=-1,a,b;
        for(String str:tokens)
        {
        try{          
              in.add(Integer.parseInt(str));
              i++;
        }catch(NumberFormatException e){
          switch(str){
              case "+":
                  a = in.remove(i);
                  i--;
                  b = in.remove(i);
                  i--;
                  in.add(a+b);
                  i++;
                  break;
              case "-":
                  a = in.remove(i);
                  i--;
                  b = in.remove(i);
                  i--;
                  in.add(b-a);
                  i++;
                  break;
              case "*":
                  a = in.remove(i);
                  i--;
                  b = in.remove(i);
                  i--;
                  in.add(a*b);
                  i++;
                  break;
              case "/":
                  a = in.remove(i);
                  i--;
                  b = in.remove(i);
                  i--;
                  in.add(b/a);
                  i++;
                  break;
          }
          }
        }
        return in.get(0);
    }
}
