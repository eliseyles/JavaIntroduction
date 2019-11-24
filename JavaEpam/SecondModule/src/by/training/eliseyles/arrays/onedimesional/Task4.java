//4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.

package by.training.eliseyles.arrays.onedimesional;

import by.training.eliseyles.util.Input;
import by.training.eliseyles.util.Output;

public class Task4 {
    public static final int START = 0;
    public static final int INVALID_RETURN_VALUE = -1;

    public static void main(String[] args) {
        double[] arr = Input.nextDoubleArray();

        Output.displayDoubleArray(arr);
        Output.displayDoubleArray(replaceMinMax(arr));
    }

    public static double[] replaceMinMax(double[] arr) {
        int minPosition = findMinNumberPosition(arr);
        int maxPosition = findMaxNumberPosition(arr);

        double buffer = arr[minPosition];
        arr[minPosition] = arr[maxPosition];
        arr[maxPosition] = buffer;

        return arr;
    }

    private static int findMinNumberPosition(double[] arr) {
        if (arr != null && arr.length > START) {
            int position = START;
            double min = arr[START];
            for (int i = START; i < arr.length; i++) {
                if (arr[i] < min) {
                    position = i;
                    min = arr[i];
                }
            }
            return position;
        }
        return INVALID_RETURN_VALUE;
    }

    private static int findMaxNumberPosition(double[] arr) {
        if (arr != null && arr.length > START) {
            int position = START;
            double max = arr[START];
            for (int i = START; i < arr.length; i++) {
                if (arr[i] > max) {
                    position = i;
                    max = arr[i];
                }
            }
            return position;
        }
        return INVALID_RETURN_VALUE;
    }
}
