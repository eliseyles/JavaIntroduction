//7. Пусть даны две неубывающие последовательности действительных чисел
//a1  a2  an и b1  b2  bm
//.
//Требуется указать те места, на которые нужно вставлять элементы последовательности
//b1  b2  bm
//в первую
//последовательность так, чтобы новая последовательность оставалась возрастающей.

package by.training.eliseyles.arrays.sorts;

import by.training.eliseyles.util.Input;
import by.training.eliseyles.util.Output;

public class Task7 {
    public static final int ZERO_INDEX = 0;

    public static void main(String[] args) {
        int[] arr1 = Input.nextIntArray();
        int[] arr2 = Input.nextIntArray();
        Output.displayIntArray(arr1);
        Output.displayIntArray(arr2);
        System.out.println();
        Output.displayIntArray(arraysMerge(arr1, arr2));

    }

    public static int[] arraysMerge(int[] firstArr, int[] secondArr) {
        if (firstArr != null && secondArr != null) {
            int[] index = new int[secondArr.length];
            int firstPoint = ZERO_INDEX;
            int secondPoint = ZERO_INDEX;
            while (firstPoint != firstArr.length && secondPoint != secondArr.length) {
                if (secondArr[secondPoint] < firstArr[firstPoint]) {
                    index[secondPoint] = secondPoint + firstPoint;
                    secondPoint++;
                } else {
                    firstPoint++;
                }
            }

            return index;
        }
        return new int[]{};
    }

}
