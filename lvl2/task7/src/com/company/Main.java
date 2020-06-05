package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Введите индекс");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(isValid(name));
    }
    public static boolean isValid (String name){
        if (name.length() != 5) {
            return false;
        }
        try {
            int index = Integer.parseInt(name);
            return true;
        }
        catch(Exception e) {
            return false;
        }
    }
}
