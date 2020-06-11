package com.company;
import java.util.Scanner;
public class palindrom {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        String palindrom = read.nextLine();
            System.out.println(palindrom +" - "+isPalindrome(palindrom));

    }

    public static String reverseString(String s) {
        String result ="";
        for (int i = s.length()-1; i>=0; i--) {
            result += s.charAt(i);
        }
        return result;
    }

    public static boolean isPalindrome(String s) {
        return(s.equals(reverseString(s)));
    }

}
