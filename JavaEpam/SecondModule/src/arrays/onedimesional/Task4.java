//4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.

package arrays.onedimesional;

import util.Input;
import util.Output;

public class Task4 {
    public static final int ZERO = 0;
    public static final int INVALIDRETURNVALUE = -1;

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
        if (arr != null && arr.length > ZERO) {
            int position = ZERO;
            double min = arr[ZERO];
            for (int i = ZERO; i < arr.length; i++) {
                if (arr[i] < min) {
                    position = i;
                    min = arr[i];
                }
            }
            return position;
        }
        return INVALIDRETURNVALUE;
    }

    private static int findMaxNumberPosition(double[] arr) {
        if (arr != null && arr.length > ZERO) {
            int position = ZERO;
            double max = arr[ZERO];
            for (int i = ZERO; i < arr.length; i++) {
                if (arr[i] > max) {
                    position = i;
                    max = arr[i];
                }
            }
            return position;
        }
        return INVALIDRETURNVALUE;
    }
}
