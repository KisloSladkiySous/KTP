package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Введите количество куриц, коров и свиней");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3=in.nextInt();
        System.out.println(animals(num1,num2,num3));
    }
    public static int animals(int chickens,int cows,int pigs){
        int legs= chickens*2+cows*4+pigs*4;
        return legs;
    }
}
