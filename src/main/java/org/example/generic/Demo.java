package org.example.generic;

import java.util.Scanner;

public class Demo {
    public enum Days {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    }
    public static void main(String[] args) {

        Days[] values = Days.values();
        Scanner myObj = new Scanner(System.in);
        String userName = myObj.nextLine();


        Days today = Days.WEDNESDAY;
        if (today == Days.SATURDAY || today == Days.SUNDAY) {
            System.out.println("It's the weekend!");
        } else {
            System.out.println("It's a weekday.");
        }
    }
}
