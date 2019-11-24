//4. Сортировка обменами. Дана последовательность чисел
//a1  a2  an
//.Требуется переставить числа в
//порядке возрастания. Для этого сравниваются два соседних числа
//i i+1 a и a
//. Если
//ai  ai+1
//, то делается
//перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
//Составить алгоритм сортировки, подсчитывая при этом количества перестановок.

package by.training.eliseyles.arrays.sorts;

import by.training.eliseyles.util.Input;
import by.training.eliseyles.util.Output;

public class Task4 {

    public static final int ZERO_INDEX = 0;
    public static final int OFFSET = 1;
    public static final int ZERO = 0;
    public static final int WRONG_VALUE = -1;



    public static void main(String[] args) {
        int[] arr = Input.randomIntArrayFilling(10, -10, 20);
        Output.displayIntArray(arr);
        System.out.println(bubbleSort(arr));
        Output.displayIntArray(arr);

    }

    private static int bubbleSort(int[] row) {
        if (row != null){
            int replaceNumber = ZERO;
            for (int i = ZERO_INDEX; i < row.length; i++) {
                for (int j = ZERO_INDEX; j < row.length - OFFSET; j++) {
                    if (row[j] > row[j + OFFSET]) {
                        replaceNumber++;
                        int temp = row[j];
                        row[j] = row[j + OFFSET];
                        row[j + OFFSET] = temp;
                    }
                }
            }
            return replaceNumber;
        }
        return WRONG_VALUE;
    }
}
