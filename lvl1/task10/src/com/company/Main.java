package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите a,b,c  ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        System.out.println(abcmath(a,b,c));
    }
    public static boolean abcmath(int a,int b ,int c){
        for (int i=0;i<b;i++){
            a+=a;
        }
        return (a%c==0);
    }
}
