package com.company;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Введите число: ");
        Integer num = Integer.parseInt(input.nextLine());
        System.out.println(ulam(num));
    }


    public static Integer ulam(Integer n) {
        List<Integer> Ulams = new ArrayList<Integer>();
        Ulams.add(1);
        Ulams.add(2);
        int next = Ulams.get(Ulams.size() - 1) + 1;
        int count;
        while (Ulams.size() != n) {
            count = 0;
            for (int i = 0; i < Ulams.size() - 1; i++) {
                for (int j = i + 1; j < Ulams.size(); j++) {
                    if (Ulams.get(i) + Ulams.get(j) == next) count++;
                    if (count > 1) break;
                }
                if (count > 1) break;
            }
            if (count == 1) Ulams.add(next);
            next++;
        }
        return Ulams.get(n - 1);
    }
}