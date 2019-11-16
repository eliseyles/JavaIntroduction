//1. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
//все числа от 1 до введенного пользователем числа.

package loops;

import java.util.Scanner;

public class Task1 {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int a = scan.nextInt();
        System.out.printf("result = %.0f", summarize(a));
    }

    private static double summarize(int a) {
        if (a > 0) {
            double sum = 0;
            for (int i = 1; i < a; i++) {
                sum += i;
            }
            return sum;
        } else {
            return -1;
        }
    }
}
