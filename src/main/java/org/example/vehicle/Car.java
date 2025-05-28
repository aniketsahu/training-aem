package org.example.vehicle;

public class Car implements Transport,Vehicle {
    String color;
    String name;
    int cc;
    final int totalMarks = 500;
    public Car(String color, String name, int cc){
        this.cc = cc;
        this.color = color;
        this.name = name;
    }

    @Override
    public void blowHorn() {

    }

    @Override
    public void applyBreak() {

    }
}
