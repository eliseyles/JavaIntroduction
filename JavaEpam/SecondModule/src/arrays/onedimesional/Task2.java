package arrays.onedimesional;

import util.Input;


public class Task2 {

    public static void main(String[] args) {
        double[] arr = Input.nextDoubleArray();
        double z = Input.nextInt("Enter Z: ");

        System.out.println(replaceNumbersBiggerZReturnReplaceNumber(arr, z));
    }

    private static double[] replaceNumbersBiggerZReturnArr(double[] arr, double zNumber) {
        if (arr != null) {
            int replaceNumber = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > zNumber) {
                    arr[i] = zNumber;
                }
            }
            return arr;
        } else return null;
    }

    private static int replaceNumbersBiggerZReturnReplaceNumber(double[] arr, double zNumber) {
        if (arr != null) {
            int replaceNumber = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > zNumber) {
                    arr[i] = zNumber;
                    replaceNumber++;
                }
            }
            return replaceNumber;
        } else return -1;
    }

    private static int findReplaceNumber(double[] arr, double[] replaceArr) {
        if (arr != null && replaceArr != null) {
            int replaceNumber = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != replaceArr[i]) {
                    replaceNumber++;
                }
            }
            return replaceNumber;
        } else return -1;
    }
}


