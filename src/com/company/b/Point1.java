package com.company.b;

import java.awt.Point;

public class Point1 {
    public static void main(String[] args) {
        Point p = new Point(2, 4);
        Point p1 = new Point(4, 6);
        System.out.println(p.distance(p1));
    }
}
