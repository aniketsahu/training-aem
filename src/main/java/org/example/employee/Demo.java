package org.example.employee;

import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Engineer engineer = new Engineer(1000);
        List<Engineer> list = Arrays.asList(new Engineer(1000), new Engineer(998), new Engineer(1800), new Engineer(100));

        float calculateBonus = engineer.calculateBonus();
        System.out.println("So calculated bonus is " + calculateBonus);
    }
}
