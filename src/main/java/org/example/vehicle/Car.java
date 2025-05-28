package org.example.vehicle;

public class Car implements Transport, Vehicle {
    String color;
    String name;
    int cc;
    final int totalMarks = 500;
    private int currentSpeed;

    public Car(String color, String name, int cc){
        this.cc = cc;
        this.color = color;
        this.name = name;
    }
    // Method to increase speed
    public void speedUp(int increaseSpeedBy) {
        currentSpeed += increaseSpeedBy;
        System.out.println(name + " speed increased by " + increaseSpeedBy + " km/h. Current speed: " + currentSpeed + " km/h");
    }

    // Method to decrease speed
    public void speedDown(int decreaseSpeedBy) {
        currentSpeed -= decreaseSpeedBy;
        if (currentSpeed < 0) currentSpeed = 0;
        System.out.println(name + " speed decreased by " + decreaseSpeedBy + " km/h. Current speed: " + currentSpeed + " km/h");
    }

    @Override
    public void blowHorn() {

    }

    @Override
    public void applyBreak() {

    }
}

class CarTest {
    public static void main(String[] args) {
        Car car = new Car("Red", "Honda Civic", 1800);

        car.speedUp(5);
        car.speedDown(2);
        car.speedUp(3);
        car.speedDown(6); // this will bring speed to 0
    }
}
