package ru.mirea.task1;

public class ex_1 {
    public static void main(String[] args) {
        int[] array;
        array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;

        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.print("Сумма посчитанная циклом for:  ");
        System.out.println(sum);

        sum = 0;
        int a = 0;
        while (a < array.length) {
            sum += array[a];
            a++;
        }
        System.out.print("Сумма посчитанная циклом while:  ");
        System.out.println(sum);

        sum = 0;
        a = 0;
        do {
            sum += array[a];
            a++;
        } while (a < array.length);
        System.out.print("Сумма посчитанная циклом do while:  ");
        System.out.println(sum);
    }
}
