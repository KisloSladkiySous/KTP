package com.company;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        int n = in.nextInt();
        System.out.println(palindromeDescendant(n));
    }
    public static boolean palindromeDescendant(int n) {
        String line = Integer.toString(n);
        String temp = "";
        for (int i = 0; i < line.length(); i++) temp += line.charAt(i);
        for (int i = 0; line.length() >= 2; i++) {
            if (line.equals(temp)) return true;
            line = "";
            for (int y = temp.length() - 1; y > 0; y -= 2)
                line += Character.getNumericValue(temp.charAt(y)) + Character.getNumericValue(temp.charAt(y - 1));
            temp = "";
            for (int x = 0; x < line.length(); x++) temp += line.charAt(x);
        }
        return false;
    }
}