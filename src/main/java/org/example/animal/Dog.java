package org.example.animal;

class Dog extends Animal{
         public String dogName = "Grover";
         String breed = "Bulldog";

         public Dog(String name) {
             super(name);
         }

         public void makeSound() {
             System.out.println(name + " the dog barks.");
         }
        public void test() {

        }

         public static void main(String[] args) {
             Dog myDog = new Dog("Rocky");

             myDog.makeSound();

         String name;


     }

 }