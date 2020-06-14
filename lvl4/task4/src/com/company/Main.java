package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Начало работы: ");
        double start = input.nextDouble();
        System.out.printf("Конец: ");
        double end = input.nextDouble();
        System.out.printf("Оплата: ");
        double salary = input.nextDouble();
        System.out.printf("Оплата за переработку: ");
        double overtimeSalary =input.nextDouble();
        System.out.println(overTime(start, end, salary, overtimeSalary));
    }
    public static String overTime(double start,double end, double salary, double overtimesalary) {
        double sum=0.0;
        for(double i=start; i<end; i+=0.25){
            if(i<17){
                sum += 0.25 *salary;
            }else if(i>=17){
                sum += 0.25 * salary * overtimesalary;
            }
        }
        return String.format("$%.2f", sum);
    }
}
