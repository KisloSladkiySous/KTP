package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Введите строку");
        Scanner read=new Scanner(System.in);
        String line = read.nextLine();
        System.out.println(flipEndChars(line));
    }
    public static String flipEndChars(String str){
        if (str.length()<2)
            return "несовместиво";
        if (str.charAt(0)==str.charAt(str.length()-1))
            return "Два- это пара";
        char[] chars = str.toCharArray();
        char first = chars[0];
        chars[0] = chars[chars.length - 1];
        chars[chars.length - 1] = first;
        str = new String(chars);
        return str;

    }
}
