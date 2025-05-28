package org.example.employee;

public class Demo {
    public static void main(String[] args) {
        Engineer engineer = new Engineer(1000);
        float calculateBonus = engineer.calculateBonus();
        System.out.println("So calculated bonus is " + calculateBonus);
    }
}
