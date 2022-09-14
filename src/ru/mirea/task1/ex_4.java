package ru.mirea.task1;

import java.util.Random;
import java.util.Arrays;

public class ex_4 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        double[] arr2 = new double[10];
        int min = -100;
        int max = 100;
        int diff = max - min;
        final Random random = new Random();
        System.out.println("До сортировки:");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(diff + 1);
            System.out.println("Число номер " + i + ": " + arr[i]);
        }
        Arrays.sort(arr);
        System.out.println();
        System.out.println("После сортировки:");
        for(int i = 0; i < arr.length; i++){
            System.out.println("Число номер " + i + ": " + arr[i]);
        }
        System.out.println();
        System.out.println();
        System.out.println("До сортировки:");
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = Math.random();
            System.out.println("Число номер " + i + ": " + arr2[i]);
        }
        Arrays.sort(arr2);
        System.out.println();
        System.out.println("После сортировки:");
        for(int i = 0; i < arr2.length; i++){
            System.out.println("Число номер " + i + ": " + arr2[i]);
        }
    }
}
