package org.example.shape;

public class Circle extends Shape{
    int radius;

    @Override
    public double calculateArea() {
        //calculate area of circle
        area = 2 * 3.16 * radius;
        return area;
    }
}
