package com.company;

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите формулу");
        Scanner read=new Scanner(System.in);
        String formula =read.nextLine();
        System.out.println(formula(formula));
    }

    private static boolean formula(String str) {
        int size = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') size++;
        }
        String a[] = new String[size + 1];
        Arrays.fill(a, "");
        size = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') size++;
            else a[size] += str.charAt(i);
        }
        if (size > 4 || !(a[3].equals("="))) return false;
        try {
            int a1 = Integer.parseInt(a[0]);
            int a2 = Integer.parseInt(a[2]);
            int a3 = Integer.parseInt(a[4]);
            if (a[1].equals("+")) {
                return (a1 + a2) == a3;
            } else if (a[1].equals("-")) {
                return (a1 - a2) == a3;
            } else if (a[1].equals("*")) {
                return (a1 * a2) == a3;
            } else if (a[1].equals("/")) {
                return (a1 / a2) == a3;
            } else return false;
        } catch (Throwable e) {
            return false;
        }
    }
}