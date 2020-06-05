package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int num1= in.nextInt();
        System.out.println(fibonacci(num1));

    }
    public static int fibonacci(int num){
        if (num == 0) {
            return 1;
        } else if (num == 1) {
            return 1;
        } else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }
}
