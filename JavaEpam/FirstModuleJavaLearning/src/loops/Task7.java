//7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
//m и n вводятся с клавиатуры.

package loops;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Task7 {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int m = scan.nextInt();
        int n = scan.nextInt();
        for (int i = m; i <= n; i++) {
            System.out.printf("all dividers of %d: %s \n", i, findAllDivider(i).toString());
        }
    }

    private static SortedSet<Integer> findAllDivider(int number) {
        SortedSet<Integer> dividerSet = new TreeSet<>();

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                dividerSet.add(i);
                dividerSet.add(number / i);
            }
        }
        return dividerSet;
    }
}
