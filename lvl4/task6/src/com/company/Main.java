package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int num=in.nextInt();
        System.out.println(bugger(num));
    }

    public static int bugger(int num) {
        int count = 0;

        while(Integer.valueOf(num).toString().toCharArray().length > 1){
            int newNum = 1;
            for(char c : Integer.valueOf(num).toString().toCharArray()){
                newNum *= Integer.valueOf(String.valueOf(c));
            }
            num = newNum;
            count += 1;
        }
        return count;
    }

}