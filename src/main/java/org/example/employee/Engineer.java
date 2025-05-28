package org.example.employee;

public class Engineer extends Employee {

    public Engineer(int salary) {
        this.salary = salary;
    }

    public float calculateBonus() {
        return (float) (salary * .10);
    }
}
