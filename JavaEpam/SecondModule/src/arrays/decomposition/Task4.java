//4. На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
//из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.

package arrays.decomposition;

import util.Input;
import util.Output;

public class Task4 {
    public static final int ZERO_INDEX = 0;
    public static final int OFFSET = 1;
    public static final int WRONG_VALUE = Integer.MIN_VALUE;
    public static final int X = 0;
    public static final int Y = 1;
    public static final int POW = 2;


    public static void main(String[] args) {
        int[][] arr = Input.nextDualIntArray("Enter points number: ", "x", "y");
        Output.displayIntMatrix(arr);
        Output.displayIntMatrix(findMaxDistance(arr));
//        System.out.println(findDistance(new int[]{0, 0}, new int[]{3, 4}));
    }

    public static int[][] findMaxDistance(int[][] points) {
        if (points != null) {
            double maxDistance = Double.MIN_VALUE;
            int[][] pair = new int[2][];
            for (int i = ZERO_INDEX; i < points.length; i++) {
                for (int j = i + OFFSET; j < points.length; j++) {
                    double distance = findDistance(points[i], points[j]);
                    if (distance > maxDistance) {
                        maxDistance = distance;
                        pair[0] = points[i];
                        pair[1] = points[j];
                    }
                }
            }
            return pair;

        }
        return new int[][]{};
    }

    private static double findDistance(int[] firstPoint, int[] secondPoint) {
        if (firstPoint != null && secondPoint != null) {
            return Math.sqrt((Math.pow(secondPoint[X] - firstPoint[X], POW)
                    + Math.pow(secondPoint[Y] - firstPoint[Y], POW)));
        }
        return WRONG_VALUE;
    }

}
