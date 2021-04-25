package com.company;

import java.text.DecimalFormat;

public class StringTransform {
    static int countTransformation(String a,
                                   String b)
    {
        int n = a.length(), m = b.length();

        // If b = "" i.e., an empty string. There
        // is only one way to transform (remove all
        // characters)
        if (m == 0) {
            return 1;
        }

        int dp[][] = new int[m][n];

        // Fil dp[][] in bottom up manner
        // Traverse all character of b[]
        for (int i = 0; i < m; i++) {

            // Traverse all charaters of a[] for b[i]
            for (int j = i; j < n; j++) {

                // Filling the first row of the dp
                // matrix.
                if (i == 0) {
                    if (j == 0) {
                        dp[i][j] = (a.charAt(j) == b.charAt(i)) ? 1 : 0;
                    }
                    else if (a.charAt(j) == b.charAt(i)) {
                        dp[i][j] = dp[i][j - 1] + 1;
                    }
                    else {
                        dp[i][j] = dp[i][j - 1];
                    }
                }

                // Filling other rows.
                else if (a.charAt(j) == b.charAt(i)) {
                    dp[i][j] = dp[i][j - 1]
                            + dp[i - 1][j - 1];
                }
                else {
                    dp[i][j] = dp[i][j - 1];
                }
            }
        }
        return dp[m - 1][n - 1];
    }

    // Driver code
    public static void main(String[] args)
    {
        String a = "ggoog", b = "go";
        //System.out.println(countTransformation(a, b));
        System.out.println(nthTerm( 1.0,2.0,4));
    }









    public static String nthTerm(double input1,double input2,int input3)
    {
        double r = input2/input1;
        double a = input1/r;
        double res = a * Math.pow(r,input3-1);
        DecimalFormat df = new DecimalFormat("#.###");
        String number = df.format(res);
        if(number.length()==1)
            return number+".0";
        else
            return number;
    }

















}
