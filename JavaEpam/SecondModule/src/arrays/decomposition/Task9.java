//9. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
//если угол между сторонами длиной X и Y— прямой.

package arrays.decomposition;

public class Task9 {
    public static final int ZERO = 0;
    public static final int WRONG_VALUE = -1;
    public static final int HALF = 2;


    public static void main(String[] args) {
        System.out.println(findQuadrangleSquare(5, 2, 5, 2));
    }

    public static double findQuadrangleSquare(double firstSide, double secondSide,
                                              double thirdSide, double fourthSide) {
        if (firstSide > ZERO && secondSide > ZERO && thirdSide > ZERO && fourthSide > ZERO) {
            double p = findHalfPerimetr(firstSide, secondSide, thirdSide, fourthSide);
            return Math.sqrt((p - firstSide) * (p - secondSide) * (p - thirdSide) * (p - fourthSide));
        }
        return WRONG_VALUE;
    }

    private static double findHalfPerimetr(double firstSide, double secondSide,
                                           double thirdSide, double fourthSide) {
        if (firstSide > ZERO && secondSide > ZERO && thirdSide > ZERO && fourthSide > ZERO) {
            return (firstSide + secondSide + thirdSide + fourthSide) / HALF;
        }
        return WRONG_VALUE;

    }
}
