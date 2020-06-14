package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Scanner read=new Scanner(System.in);
        System.out.println("Введите N");

        int N=in.nextInt();
        System.out.println("Введите K");
        int K=in.nextInt();
        System.out.println("Введите строку");
        String line =read.nextLine();
        System.out.println(Bessie(N,K,line));
    }
    public static String Bessie(int n,int k, String line){
            String [] text=line.split(" ");
            String newLine="";
            String essay="";
            String word;
            if (n>text.length)
                return "такое количество слов недопустимо";
            for (int i=0;i<text.length;i++){
                word=text[i];
                if (newLine.replace(" ","").length()+word.length()<=k)
                    newLine+=word+ " ";
                else {
                    essay+=newLine+"\n";
                    newLine=word+" ";
                }
            }
            if (newLine.length()>0)
                essay+=newLine+"\n";
            return essay;
    }
}
