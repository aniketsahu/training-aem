package org.example.employee;

public class Employee implements Comparable<Employee> {
    int salary;
    public int calculateSalary() {
        return 0;
    }

    public float calculateBonus() {
        return (float) (salary * .05);
    }


    @Override
    public int compareTo(Employee o) {
        return this.salary - o.salary;
    }
}
