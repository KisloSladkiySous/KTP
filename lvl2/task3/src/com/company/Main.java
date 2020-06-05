package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива  ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Введите элементы массива:");

        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.println(isAvgWhole(array));
    }
    public static boolean isAvgWhole(int[]array){
        int sum=0;
        for (int i=0;i<array.length;i++){
            sum+=array[i];

        }
        return (sum%array.length==0);
    }
}
