package org.example.compare;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student(21, 55, "T"),
                new Student(23, 59, "Sage"),
                new Student(19, 60, "Malia"),
                new Student(25, 85, "Erroll")
        );
        System.out.println("Before sorting " + students);
        AgeComparator ageComparator = new AgeComparator();

        //comparator demo
        Collections.sort(students,ageComparator);
        System.out.println("After sorting " + students);

        //comparable demo
        Collections.sort(students);
        System.out.println("After soring with comparable " + students);

    }
}
