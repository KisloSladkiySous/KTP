package com.company;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws java.io.IOException{
        System.out.println("Введите книгу и конец");
        Scanner in=new Scanner(System.in);
        String book=in.nextLine();
        char end = (char) System.in.read();
        System.out.println(countUniqueBooks(book, end));
    }

    public static int countUniqueBooks(String book, Character end) {
        Map<Character, Boolean> chars = new HashMap<Character, Boolean>();
        boolean parse = false;
        for (char c : book.toCharArray()) {
            if (parse && c != end) chars.put(c, true);
            if (c == end) {
                if (parse) parse = false;
                else parse = true;
            }
        }
        return chars.size();
    }
}