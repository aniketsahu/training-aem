package org.example.vehicle;

public class Bus implements Vehicle {
    int maxSpeed = 100;
    String route = "Route A";

    public void blowHorn() {
        System.out.println("Bus horn blown.");
    }

    public void playMusic() {
        System.out.println("Bus is playing music.");
    }

    public void changeGear() {
        System.out.println("Bus changed gear.");
    }

    public void applyBreak() {
        System.out.println("Bus brake applied.");
    }

    public void start() {
        System.out.println("Bus started.");
    }

    public void stop() {
        System.out.println("Bus stopped.");
    }
}
