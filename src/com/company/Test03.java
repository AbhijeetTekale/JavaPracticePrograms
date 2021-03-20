package com.company;
import javafx.scene.control.TextFormatter;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        int i, j, K = 8, n = 5, l = 1, m = 0;
        for (i = 1; i <= n; i++) {
            K = 8;
            m = i;
            System.out.print(i + " ");
            for (j = i; j > 0; j--) {
                m = m + K;
                System.out.print((m) + " ");
                K--;
            }
            double d = 1.0;
            DecimalFormat df;
            if(true)
                df = new DecimalFormat("#.00");
                System.out.print(df.format(d));
            System.out.println("");
        }
    }
    char[] a = new char[]{'a','b','c'};
    String s = new String(a);
    List<List<Long>> sides = new ArrayList<>();
    public List<List<Long>> getSides() {
        return sides;
    }
}