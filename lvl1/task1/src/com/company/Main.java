package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите делитель и делимое ");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println(remainder(num1,num2));
    }


    public static int remainder(int x, int y) {
        return x % y;
    }
}