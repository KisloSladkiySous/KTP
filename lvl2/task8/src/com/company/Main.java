package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите первую строку");
        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.nextLine();
        System.out.println("Введите вторую строку");
        String secondString = scanner.nextLine();
        System.out.println(isStrangePair(firstString,secondString));
    }
    public static boolean isStrangePair(String f,String s){
        if (f.charAt(0)==s.charAt(s.length() - 1) &&  f.charAt(f.length() - 1)==s.charAt(0))
            return true;
        else
            return false;
    }
}
