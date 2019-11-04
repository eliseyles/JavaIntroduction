//3. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
//треугольника

package arrays.decomposition;

public class Task3 {
    public static final int SIDE = 6;

    public static void main(String[] args) {
        System.out.println(findHexagonSquare(SIDE));
    }

    public static double findHexagonSquare(double side) {
        return 6 * findTriangleSquare(side);
    }

    private static double findTriangleSquare(double side) {
        return Math.pow(side/2, 2) * Math.sqrt(3);
    }
}
