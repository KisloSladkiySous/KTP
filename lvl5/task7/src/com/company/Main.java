package com.company;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число ");
        Scanner read = new Scanner(System.in);
        int num= read.nextInt();
        System.out.println(numToEng(num));
    }


    public static String numToEng(int num) {
        if (num == 0) return "zero";
        String result = "";
        String[] firstNumbers = new String[] {"", "one", "two", "three", "four", "five", "six", "seven",
                "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen",
                "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] secondNumbers = new String[] {
                "",
                "",
                "twenty",
                "thirty",
                "forty",
                "fifty",
                "sixty",
                "seventy",
                "eighty",
                "ninety"
        };
        if (num < 20) {
            result = firstNumbers[num];
        }
        else if (num < 100) {
            result = secondNumbers[num / 10] + (num % 10 != 0 ? " ": "") + firstNumbers[num % 10];
        }
        else if (num < 1000) {
            result = firstNumbers[num / 100] + " hundered " + (num % 100 != 0 ? numToEng(num % 100) : "");
        }
        return result;
    }
}