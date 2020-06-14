package com.company;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Введите строку: ");
        String string = input.nextLine();
        System.out.println(toStarShorthand(string));
    }


    public static String toStarShorthand(String input) {
        String result = "";
        int count = 1;
        char currentChar = new Character('a');
        for (int i = 1; i < input.length(); i++) {
            currentChar = input.charAt(i - 1);
            if (currentChar == input.charAt(i)) count++;
            else {
                if (count > 1) result += currentChar + "*" + count;
                else result += currentChar;
                count = 1;
                if (i == input.length() - 1) result += String.valueOf(input.charAt(input.length() - 1));
            }
        }
        if (count != 1) result += currentChar + "*" + count;
        return result;
    }
}