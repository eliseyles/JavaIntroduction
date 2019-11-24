package by.training.eliseyles.simpleclasses.task7.view;

import by.training.eliseyles.simpleclasses.task7.entity.Point;

public class PointView {
    public void printPoint(Point point) {
        System.out.println("Point " +
                "x = " + point.getX() +
                " y = " + point.getY());
    }
}
