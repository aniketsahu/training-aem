package org.example.shape;

public abstract class Shape {
    public double area;
    public abstract double calculateArea();
    public void draw(){
        System.out.println("drawing the shape");
    }

}
