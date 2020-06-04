package com.company;
import java.io.IOException;
public class Main {

    public static void main(String[] args)  throws IOException {
        char ch;
        System.out.println("Введите данные в консоль: ");
        ch = (char) System.in.read();
        System.out.println(ctoa(ch));
    }
    public static int ctoa(char s) {
       int ans=s;
       return ans;
    }
}
