package com.company;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Введите вес: ");
        String weight=in.nextLine();
        System.out.print("Введите рост: ");
        String height=in.nextLine();
        System.out.println(BMI(weight,height));
    }


    public static String BMI(String weight, String height)
    {
        String result="";
        String[] strW=weight.split(" ");
        double w=Double.parseDouble(strW[0]);
        String[] strH=height.split(" ");
        double h=Double.parseDouble(strH[0]);
        if (strW[1].equals("pounds"))
            w*=0.453592;
        if (strH[1].equals("inches"))
            h*=0.0254;
        double index= w/Math.pow(h,2);
        if (index<18.5)
            result=String.format("%.1f", index)+" Underweight";
        if ((index>18.5)&&(index<24.9))
            result=String.format("%.1f", index)+" Normalweight";
        if (index>25)
            result=String.format("%.1f", index)+" Overweight";
        return result;
    }


}