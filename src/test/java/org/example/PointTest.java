package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {
    @Test
    public void  euclideanDistanceBetweenTwoPoints(){
        Point p1 = new Point(1.0,1.0);
        double x1 = 0.0;
        double y1 = 0.0;
        double actualDistance = p1.distanceBetweenTwoPoints(x1,y1);
        assertEquals(1.41, actualDistance);
    }
}