package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner in = new Scanner(System.in);
	    int num =in.nextInt();
	    System.out.println(boxSeq(num));
    }
    public static int boxSeq(int num){
        if (num % 2 == 0) {
            return num;
        }
        else return num + 2;
    }
    }

