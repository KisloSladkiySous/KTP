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
        System.out.println(differenceMaxMin(array));
    }
    public static int differenceMaxMin(int [] Array){
        int min,max;
        min=Array[0];
        max=Array[0];
        for (int i=1;i<Array.length;i++){
            if (Array[i]<min)
                min=Array[i];
            if (Array[i]>max)
                max=Array[i];
        }
        return max-min;
    }
}
