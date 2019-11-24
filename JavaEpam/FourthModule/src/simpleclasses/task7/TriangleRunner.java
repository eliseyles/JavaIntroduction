package simpleclasses.task7;

import simpleclasses.task7.entity.Point;
import simpleclasses.task7.entity.Triangle;
import simpleclasses.task7.logic.TriangleLogic;
import simpleclasses.task7.view.PointView;

public class TriangleRunner {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(new Point(0,0), new Point(3, 2), new Point(4, 0));
        System.out.println(new TriangleLogic().getPerimeter(triangle));
        System.out.println(new TriangleLogic().getSquare(triangle));

        new PointView().printPoint(new TriangleLogic().getMedianCrossingPoint(triangle));
    }

}
