package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Введите  a,b,c");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3=in.nextInt();
        System.out.println(operation(num1,num2,num3));
    }
    public static String operation (int a,int b,int c){
        if (a+b==c)
            return "added";
        else if (a-b==c)
            return  "subtracted";
        else  if (a/b==c)
            return "divided";
         else  if (a*b==c)
             return "multiplied";
        else return "none";

    }
}
