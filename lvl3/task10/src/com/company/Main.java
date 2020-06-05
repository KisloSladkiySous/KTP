package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Введите три грани треугольника");
        Scanner in= new Scanner(System.in);
        int num1 =in.nextInt();
        int num2 =in.nextInt();
        int num3 =in.nextInt();;
        System.out.println(rightTriangle(num1,num2,num3));
    }
    public static boolean rightTriangle(int a,int b,int c){
        int []array={a,b,c};
        Arrays.sort(array);
        return (Math.sqrt(Math.pow(array[0], 2) + Math.pow(array[1], 2)) == array[2]);
    }
}
