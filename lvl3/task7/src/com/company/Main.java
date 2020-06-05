package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(isKaprekar(num));
    }
    private static boolean isKaprekar(int x) {
    String pow = String.valueOf((int) Math.pow(x, 2));
    int num1, num2 = 0;
        if (pow.length() == 1)
    num1 = 0;
        else {
        num1 = Integer.parseInt(pow.substring(0, (int) (pow.length() / 2)));
        num2 = Integer.parseInt(pow.substring((int) (pow.length() / 2)));
    }
        return (num1 + num2 == x);
}
}
