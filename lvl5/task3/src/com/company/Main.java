package com.company;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("сокращение: ");
        String shortcut = input.nextLine();
        System.out.printf("Слово: ");
        String word = input.nextLine();
        System.out.println(canComplete(shortcut, word));
    }


    public static boolean canComplete(String shortword, String longword) {
        boolean exists = false;
        for (char c: shortword.toCharArray()) {
            exists = false;
            for (int i = 0; i < longword.length(); i++) {
                if (c == longword.charAt(i)) {
                    longword = longword.substring(i + 1);
                    exists = true;
                    break;
                }
            }
            if (exists == false) return false;
        }
        return true;
    }
}