package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Введите строку");
        Scanner read=new Scanner(System.in);
	    String str=read.nextLine();
        System.out.println(findZip(str));
    }
    public static int findZip(String str){
        if (str.indexOf("zip") != str.lastIndexOf("zip")&& str.indexOf("zip") != -1) {
            return str.lastIndexOf("zip");
        }
        return -1;
    }
}
