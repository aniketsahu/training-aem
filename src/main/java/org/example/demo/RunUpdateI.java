package org.example.demo;

import org.example.vehicle.Car;

public class RunUpdateI {
    int i = 5;
    public static void main(String[] args){
        //creating an object of Second class
        //Car car1 = new Car();
        Car car = new Car("red","BMW",3000);

        UpdateI second = new UpdateI();
        //printing the value of class variable before increasing the value
        System.out.println(second.getVarOfSecondClass());

        //increasing the value of class variable
        second.increaseI(10);

        second.varOfSecondClass = second.varOfSecondClass + 10;

        System.out.println(second.varOfSecondClass);

        //Accessing static method with class name

        int decreasedValue = UpdateI.decreaseI(5);
        System.out.println(decreasedValue);

    }
}
