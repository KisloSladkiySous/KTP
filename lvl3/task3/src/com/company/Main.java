package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        if(checkPerfect(num))
            System.out.println("Число является совершенным");
        else System.out.println("число не является совершенным");
    }
    public static boolean checkPerfect(int num){
        int summa =0;
        for(int i=1;i<num;i++) {
            if(num%i==0) summa+=i;
        }
        if(summa==num)
            return true; else return false;
    }
}

