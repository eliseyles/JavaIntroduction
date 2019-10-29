//8. Дана последовательность целых чисел а1 ,а2 ,..., аn.
//Образовать новую последовательность, выбросив из исходной те члены, которые равны min(а1 ,а2 ,..., аn.)

package arrays.onedimesional;

import util.Input;

import java.util.ArrayList;

public class Task8 {
    public static final int INVALIDVALUE = Integer.MIN_VALUE;
    public static final int START = 0;


    public static void main(String[] args) {
        int[] arr = Input.nextIntArray();

        System.out.println(makeArrWithoutMin(arr));
    }

    private static ArrayList<Integer> makeArrWithoutMin(int[] arr) {
        if (arr != null) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = START; i < arr.length; i++) {
                if (arr[i] != findMin(arr)) {
                    arrayList.add(arr[i]);
                }
            }
            return arrayList;
        }
        return null;
    }

    private static int findMin(int[] arr) {
        if (arr != null) {
            int min = arr[START];
            for (int i = START; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            return min;
        }
        return INVALIDVALUE;
    }
}
