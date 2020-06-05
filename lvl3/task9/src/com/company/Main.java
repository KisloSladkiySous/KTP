package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner in=new Scanner(System.in);
        int num= in.nextInt();
        System.out.println(nextPrime(num));
    }
    public static int nextPrime(int number){
        int next=number;
        boolean Prime=true;
        while(1==1){
            Prime=true;
            for (int i=2;i< next-1;i++) {
                if (next % i == 0)
                    Prime = false;
            }
            if (Prime)
                return next;
            next++;
        }

    }
}
