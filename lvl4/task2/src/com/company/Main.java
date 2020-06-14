package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Введите кластер скобок");
        Scanner  read = new Scanner(System.in);
        String line = read.nextLine();
        System.out.println(split(line));
    }
    public static StringBuilder split(String line){
        StringBuilder newline=new StringBuilder();
        String cluster="";
        int count=0;
        for (char i:line.toCharArray())
        {
            if (i=='(')
            {
                count+=1;
                cluster+="(";
            }
            else {
                count-=1;
                cluster += ")";
            }
            if (count==0)
            {
                newline.append(cluster+",");
                cluster="";
            }
        }

        return newline;
    }
}
