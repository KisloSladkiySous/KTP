package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Введите коэффициенты квадратного уравнения");
	Scanner in=new Scanner(System.in);
	int a=in.nextInt();
	int b=in.nextInt();
	int c=in.nextInt();
        System.out.println(solutions(a,b,c));
    }
    public static int solutions(int a,int b,int c){
        double D=Math.pow(b,2)-4*a*c;
        if (D>0)
            return 2;
        if (D==0)
            return 1;
        else return 0;
    }
}
