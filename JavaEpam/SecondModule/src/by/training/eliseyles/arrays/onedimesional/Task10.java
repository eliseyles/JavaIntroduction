//10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
//элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.

package by.training.eliseyles.arrays.onedimesional;

import by.training.eliseyles.util.Input;
import by.training.eliseyles.util.Output;

public class Task10 {

    public static final int START = 0;
    public static final int REPLACE = 0;
    public static final int HALF = 2;


    public static void main(String[] args) {
        int[] arr = Input.nextIntArray();
        Output.displayIntArray(arr);
        Output.displayIntArray(arrayCompressing(arr));
    }

    public static int[] arrayCompressing(int[] arr) {
        if (arr != null) {
            for (int i = START; i < arr.length / HALF + (arr.length % HALF); i++) {
                arr[i] = arr[i * HALF];
            }
            for (int i = arr.length / HALF + (arr.length % HALF); i < arr.length; i++) {
                arr[i] = REPLACE;
            }
        }
        return arr;
    }
}
