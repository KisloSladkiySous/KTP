package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите длину двух ребер треугольника");
        int num1=in.nextInt();
        int num2=in.nextInt();
        System.out.println(nextEdge(num1,num2));

    }
    public static int nextEdge(int a, int b) {
        return a + b - 1;
    }
}
