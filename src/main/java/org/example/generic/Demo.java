package org.example.generic;

public class Demo {
    public static void main(String[] args) {
        DayOfWeek today = DayOfWeek.WEDNESDAY;

        if (today == DayOfWeek.SATURDAY || today == DayOfWeek.SUNDAY) {
            System.out.println("It's the weekend!");
        } else {
            System.out.println("It's a weekday.");
        }
    }
}
