package org.example.employee;

public abstract class Employee {
    //declaring variable
    private int employeeId;
    private String employeeName;
    protected int salary;
    private int availableLeaves;
    private int bonusPercentage;

    public abstract int calculateSalary();
    public abstract int calculateBonus();

    public Employee(){
        this.employeeId = 1;
        this.employeeName = "aniket";
        this.salary = 100;
    }

    public Employee(int employeeId, String employeeName, int salary, int availableLeaves, int bonusPercentage) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
        this.availableLeaves = availableLeaves;
        this.bonusPercentage = bonusPercentage;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAvailableLeaves() {
        return availableLeaves;
    }

    public void setAvailableLeaves(int availableLeaves) {
        this.availableLeaves = availableLeaves;
    }

    public int getBonusPercentage() {
        return bonusPercentage;
    }

    public void setBonusPercentage(int bonusPercentage) {
        this.bonusPercentage = bonusPercentage;
    }
}
