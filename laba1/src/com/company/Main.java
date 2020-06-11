package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 1;i<=100;i++) {
            if(isPrime(i)) {
                System.out.print(i+" ");
            }
        }

    }
    public static boolean isPrime(int n) {
        boolean prime = true;

        for (int j =2; j<n; j++) {
            if (n%j==0) {
                prime = false;
                return prime;
            }
        }
        return prime;
    }
}
