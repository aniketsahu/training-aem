package org.example.animal;

 public class Animal {
     public String type;
     protected String name;
     protected String sounds = "meow";
     /*Animal(){
         //this.name = name;
     }*/
     Animal(String name){
         this.name = name;
     }
     public void sound() {
         System.out.println("My sound is " + sounds);
         Dog dog = new Dog("Grover");
         dog.test();
     }}
     // Assignment 3: Animal Inheritance and super keyword


