package org.example.animal;

public class Cat implements AnimalInterface {
    public Cat(){

    }
    public Cat(int i){

    }
    @Override
    public void sound() {
        System.out.println("This is the implementation class of the interface");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.sound();
    }
}
