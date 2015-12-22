package com.dmtihor;

/**
 * Created by Adm on 12/22/2015.
 */
public class DistancesBetweenPoints {
    static double length(Point a, Point b) {
        return Math.sqrt((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y));
    }
}
