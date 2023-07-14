package com.wxfx.smart;

public class Circle {
    double red;
    final double PI;

    public Circle(double r) {
        red = r ;
        PI = 3.14;
    }

    public double getArea() {
        return (red * red) * PI;
    }
}
