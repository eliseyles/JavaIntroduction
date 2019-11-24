//7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
//площади, периметра и точки пересечения медиан.

package by.training.eliseyles.simpleclasses.task7.logic;

import by.training.eliseyles.simpleclasses.task7.entity.Point;
import by.training.eliseyles.simpleclasses.task7.entity.Triangle;

public class TriangleLogic {

    public static final double DEFAULT_VALUE = 0;
    public static final double HALF = 2;
    public static final double THIRD = 3;

    public boolean isExist(Triangle triangle) {
        return triangle.getLengthAB() + triangle.getLengthBC() > triangle.getLengthCA()
                || triangle.getLengthBC() + triangle.getLengthCA() > triangle.getLengthAB()
                || triangle.getLengthAB() + triangle.getLengthCA() > triangle.getLengthBC();
    }

    public double getPerimeter(Triangle triangle) {
        if (isExist(triangle)) {
            return triangle.getLengthBC() + triangle.getLengthCA() + triangle.getLengthAB();
        }
        return DEFAULT_VALUE;
    }

    public double getSquare(Triangle triangle) {
        if (isExist(triangle)) {
            double halfPerimeter = getPerimeter(triangle) / HALF;
            return Math.sqrt(halfPerimeter * (halfPerimeter - triangle.getLengthAB())
                    * (halfPerimeter - triangle.getLengthBC()) * (halfPerimeter - triangle.getLengthCA()));
        }
        return DEFAULT_VALUE;
    }

    public Point getMedianCrossingPoint(Triangle triangle) {
        return new Point((triangle.getA().getX() + triangle.getB().getX() + triangle.getC().getX()) / THIRD,
                (triangle.getA().getY() + triangle.getB().getY() + triangle.getC().getY()) / THIRD);
    }

}
