package com.company;
import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива 1 ");
        int size = input.nextInt();
        int array1[] = new int[size];
        System.out.println("Введите элементы массива 1:");
        for (int i = 0; i < size; i++) {
            array1[i] = input.nextInt();
        }
        System.out.println("Введите длину массива 2 ");
        int size2 = input.nextInt();
        int array2[] = new int[size2];
        System.out.println("Введите элементы массива 2:");
        for (int i = 0; i < size2; i++) {
            array2[i] = input.nextInt();
        }
        System.out.println(check(array1,array2));
    }

    public static boolean check(int[]a1,int[]a2){
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int k: a1) {
            set1.add(k);
        }

        for (int l: a2) {
            set2.add(l);
        }

        return set1.size() == set2.size();
    }




}
