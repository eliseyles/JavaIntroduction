package simpleclasses.task7;

public class TriangleRunner {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(new Point(0,0), new Point(3, 2), new Point(4, 0));
        System.out.println(new TriangleLogic().getPerimeter(triangle));
        System.out.println(new TriangleLogic().getSquare(triangle));
        PointView.printPoint(new TriangleLogic().getMedianCrossingPoint(triangle));
    }

}
