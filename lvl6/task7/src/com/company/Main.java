package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String string = in.nextLine();
        System.out.println(longestNonrepeatingSubstring(string));
    }
    public static boolean isTrue(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (i == j) continue;
                if (str.charAt(i) == str.charAt(j)) return false;
            }
        }
        return true;
    }
    public static String longestNonrepeatingSubstring(String line) {
        String help;
        String result = "";
        for (int j = 0; j < line.length(); j++) {
            help = "";
            for (int i = j; i < line.length(); i++) {
                if (i == 0) help += line.charAt(i);
                else {
                    while (isTrue(help)) {
                        help += line.charAt(i);
                        if (i != line.length()-1) i++;
                        String temp = help;
                        temp += line.charAt(i);
                        if (!isTrue(temp)) break;
                    }
                    if (help.length() > result.length())
                        result = help;
                    break;
                }
            }
        }
        return result;
    }
}