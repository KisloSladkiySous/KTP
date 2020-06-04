package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Введите основание и высоту треугольника ");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println(triAre(num1,num2));
    }
    public static double triAre(int a,int h){
        return 0.5*a*h;
    }
}
