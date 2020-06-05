package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите слово строку");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println("Введите перефикс");
        String suffix = scanner.nextLine();
        System.out.println("Введите суффикс");
        String prefix = scanner.nextLine();
        System.out.println(isPrefix(word,prefix));
        System.out.println(isSuffix(word,suffix));
    }
    public static boolean isPrefix(String word,String prefix){
        prefix = prefix.replace("-", "");
        for (int i = 0; i < prefix.length(); i++) {;
            if (prefix.charAt(i) == word.charAt(i)) {
                continue;
            }
            else {
                return false;
            }
        }
        return true;
    }
    public static boolean isSuffix(String word,String suffix){
        suffix = suffix.replace("-", "");
        int lenght = word.length() - suffix.length();
        for (int i = lenght; i < word.length(); i++) {
            if (suffix.charAt(i - lenght) == word.charAt(i)) {
                continue;
            }
            else {
                return false;
            }
        }
        return true;
    }
    }

