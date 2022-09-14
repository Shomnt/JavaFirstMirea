package ru.mirea.task1;

public class ex_5 {
    public static void main(String[] args) {
        int number = 10;
        System.out.println("Факториал числа " + number + " равен: " + factorial(number));
    }
    static int factorial(int num){
        int answer = 1;
        for (int i = 1; i <= num; i++){
            answer *= i;
        }
        return answer;
    }
}
