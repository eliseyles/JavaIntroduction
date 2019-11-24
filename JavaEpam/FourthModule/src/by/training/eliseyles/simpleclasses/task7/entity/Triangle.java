//7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
//площади, периметра и точки пересечения медиан.

package by.training.eliseyles.simpleclasses.task7.entity;

import by.training.eliseyles.simpleclasses.task7.logic.PointLogic;

import java.util.Objects;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;
    private double lengthAB;
    private double lengthBC;
    private double lengthCA;

    public Triangle() {
        setA(new Point());
        setB(new Point());
        setC(new Point());
    }

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
        setSides();
    }

    public double getLengthAB() {
        return lengthAB;
    }

    private void setLengthAB() {
        this.lengthAB = new PointLogic().findLength(a, b);
    }

    public double getLengthBC() {
        return lengthBC;
    }

    private void setLengthBC() {
        this.lengthBC = new PointLogic().findLength(c, b);
    }

    public double getLengthCA() {
        return lengthCA;
    }

    private void setLengthCA() {
        this.lengthCA = new PointLogic().findLength(a, c);
    }

    private void setSides() {
        setLengthAB();
        setLengthBC();
        setLengthCA();
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
        setSides();
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
        setSides();
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
        setSides();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.lengthAB, lengthAB) == 0 &&
                Double.compare(triangle.lengthBC, lengthBC) == 0 &&
                Double.compare(triangle.lengthCA, lengthCA) == 0 &&
                Objects.equals(a, triangle.a) &&
                Objects.equals(b, triangle.b) &&
                Objects.equals(c, triangle.c);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, c, lengthAB, lengthBC, lengthCA);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
