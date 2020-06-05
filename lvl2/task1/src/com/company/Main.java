package com.company;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws  IOException{
        System.out.println("Введите строку");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sStr = reader.readLine();
        System.out.println("Введите кол-во повторений");
        Scanner scanner = new Scanner(System.in);
        int repeats = scanner.nextInt();
        System.out.println(repeat(sStr, repeats));
    }

    public static String repeat(String str, int repeats) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < repeats; j++) {
                newStr += str.charAt(i);
            }
        }
        return newStr;
    }
}