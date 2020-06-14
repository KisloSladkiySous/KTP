package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Введите 2 строки");
        Scanner read=new Scanner(System.in);
        String line1=read.nextLine();
        String line2=read.nextLine();
        System.out.println(doesRhyme(line1,line2));
    }

    public static boolean doesRhyme(String str1, String str2) {
        str1 = str1.replaceAll("\\p{Punct}","");
        str2 = str2.replaceAll("\\p{Punct}","");
        char lastletter=str1.charAt(str1.length()-1);
        char lastletter1=str2.charAt(str2.length()-1);

        if (Character.toLowerCase(lastletter1)==Character.toLowerCase(lastletter))
            return true;
        else
            return false;
    }

}