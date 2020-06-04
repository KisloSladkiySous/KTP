package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Введите число");
	int num1=in.nextInt();
        System.out.println(addUpTo(num1));
    }
    public static int addUpTo(int a){
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum +=i;
        }
        return sum;
    }

}
