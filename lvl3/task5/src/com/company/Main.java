package com.company;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите код");
        Scanner read = new Scanner(System.in);
        String line = read.nextLine().toUpperCase();
        System.out.println(isValidHexCode(line));
    }

    public static boolean isValidHexCode(String str) {
        String[] hex = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
        List<String> list = Arrays.asList(hex);
        int index=str.indexOf("#");
        if (index !=0 || str.length() != 7){
            return false;
        }
        for (int i = 1; i < str.length(); i++) {
            if (list.contains(Character.toString(str.charAt(i)))) {
                continue;
            }

            else {
                return false;
            }

        }
        return true;
    }
}