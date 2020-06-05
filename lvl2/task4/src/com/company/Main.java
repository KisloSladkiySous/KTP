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
        System.out.println(cumulativeSum(array));
    }
    public static String cumulativeSum(int[] array){
        String newArray = "";
        for (int i = 0; i < array.length; i++) {
            int result = array[i];
            for (int j = 0; j < i; j++) {
                result += array[j];
            }
            newArray += result + " ";
        }
        return newArray;
    }
}
