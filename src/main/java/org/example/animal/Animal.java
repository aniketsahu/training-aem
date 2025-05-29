package org.example.animal;

 public class Animal {
     public String type;
     protected String name;
     protected String sounds = "meow";

     public void sound() {
         System.out.println("My sound is " + sounds);
         Dog dog = new Dog();
         dog.test();
     }
     // Assignment 3: Animal Inheritance and super keyword
     static class Dog extends Animal{
         public String dogName = "Grover";
         String breed = "Bulldog";

         public Dog(String name) {
             super(name);
         }

         public void makeSound() {
             System.out.println(name + " the dog barks.");
         }

         public static void main(String[] args) {
             AnimalInterface.Animal.Dog myDog = new AnimalInterface.Animal.Dog("Rocky");
             myDog.makeSound();
         public void test() {

         }

         String name;

         public Animal(String name) {
             this.name = name;
         }

         public void makeSound() {
             System.out.println(name + " makes a sound.");
         }
     }
 }

