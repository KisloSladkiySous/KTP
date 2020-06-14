package com.company;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Введите строку ");
        String string=in.nextLine();
        System.out.print(validColor(string));

    }

    public static boolean validColor(String string)
    {
        String[] temp = string.substring(string.indexOf('(')+1, string.indexOf(')')).split(",");
        if (string.contains("rgba") && temp.length != 4 || (string.contains(",,")))
            return false;
        for (int i = 0; i < temp.length ; i++)
        {
            double number = Double.parseDouble(temp[i]);
            if (i==3)
            {
                if (!(number >= 0 && number <= 1.0))
                    return false;
            }
            else if (!(number >= 0 && number <= 255))
                return false;
        }
        return true;
    }
}