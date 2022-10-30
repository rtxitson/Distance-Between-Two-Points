package org.example;

public class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceBetweenTwoPoints(double x1, double y1) {
        return Math.round(Math.sqrt((x1 - x) * (x1 - x) + (y1 - y) * (y1 - y))*100.0)/100.0;
    }
}
