package com.dmtihor;

/**
 * Created by Adm on 12/22/2015.
 */
public class DistancesBetweenPoints {
    static double length(Point a, Point b) {
        return Math.sqrt((Math.pow((a.x - b.x),2) + Math.pow((a.y - b.y),2)));
    }
}
