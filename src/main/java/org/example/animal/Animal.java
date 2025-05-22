package org.example.animal;

 public class Animal {
    public String type;
    protected String name;
    protected String sounds = "meow";

    public void sound(){
        System.out.println("My sound is " + sounds);
        Dog dog = new Dog();
        dog.test();
    }
    static class Dog{
        public String dogName = "Grover";
        public void test(){

        }
     }

}
