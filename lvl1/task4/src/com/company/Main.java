package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Введите  prob, prize и pay");
        Scanner in = new Scanner(System.in);
        double num1 = in.nextDouble();
        double num2 = in.nextDouble();
        double num3=in.nextDouble();
        System.out.println(profitableGame(num1,num2,num3));
    }
    public static boolean profitableGame(double prob,double prize,double pay){
        return prob*prize>pay;
    }
}
