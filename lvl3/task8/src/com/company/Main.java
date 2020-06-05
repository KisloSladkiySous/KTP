package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите последовательность");
        Scanner read=new Scanner(System.in);
        String line =read.nextLine();
        System.out.println(longestZero(line));
    }
    public static String longestZero(String str){
        String newStr="";
        int count=0,k=0;
        for (int i=0;i<str.length();i++){
            if (Character.toString(str.charAt(i)).equals("0") )
                count++;
            else count=0;
            if (count>k)
                k=count;
        }
        for (int i = 0; i < k; i++)
            newStr += "0";
        return newStr;
    }
}
