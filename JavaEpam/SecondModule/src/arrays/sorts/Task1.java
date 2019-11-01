//1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
//один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
//дополнительный массив.

package arrays.sorts;

import util.Input;
import util.Output;

import java.util.Arrays;

public class Task1 {
    public static final int START = 0;

    public static void main(String[] args) {

        int firstSize = Input.nextInt("Enter first array size: ");
        int secondSize = Input.nextInt("Enter second array size: ");
        int kPosition = Input.nextInt("Enter position k: ");

        int[] firstArr = Input.randomIntArrayFilling(firstSize, -10, 20);
        int[] secondArr = Input.randomIntArrayFilling(secondSize, -10, 20);

        Output.displayIntArray(firstArr);
        Output.displayIntArray(secondArr);

        Output.displayIntArray(arraysMerge(firstArr, secondArr, kPosition));
    }

    public static int[] arraysMerge(int[] firstArr, int[] secondArr, int position) {
        if (firstArr != null && secondArr != null && position <= firstArr.length) {
            int tempSize = firstArr.length;
            firstArr = Arrays.copyOf(firstArr, firstArr.length + secondArr.length);
            for (int i = position + secondArr.length; i < tempSize; i++) {
                firstArr[secondArr.length + i] = firstArr[i];
                System.out.println(tempSize);
            }
            for (int i = START; i < secondArr.length; i++) {
                if (position + i < tempSize) {
                    firstArr[i + secondArr.length + position] = firstArr[position + i];
                }
                firstArr[position + i] = secondArr[i];
            }
            return firstArr;
        }
        return new int[]{};
    }
}
