package com.dmtihor;

/**
 * Created by Adm on 12/22/2015.
 */
public class ShapesArea {
    public static double calcTriangleArea (int h, int a){
        return 0.5*h*a;
    }
    public static double calcRectangleArea (int a, int b){
        return a*b;
    }
    public static double calcCircleArea (int r){
        return Math.PI*r*r;
    }

}
