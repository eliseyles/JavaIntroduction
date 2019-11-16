//4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
//дробную и целую части числа и вывести полученное значение числа

package linearalgo;

import java.util.Scanner;

public class Task4 {
    private static Scanner scan = new Scanner(System.in);
    private static final int THOUSAND = 1000;

    public static void main(String[] args) {
        double x = scan.nextDouble();
        System.out.printf("result after replacing = %.3f", replacing(x));
    }

    private static double replacing(double x) {
        double fractionalPart = (x % 1);
        double integerPart = (int) x;
        return fractionalPart * THOUSAND + integerPart / THOUSAND;
    }
}
