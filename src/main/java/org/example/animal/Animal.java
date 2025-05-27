package org.example.animal;

 public class Animal {
    public String type;
    protected String name;
    protected String sounds = "meow";
    protected int i = 0;
    public void sound(){
        System.out.println("My sound is " + sounds);
        Dog dog = new Dog();
        dog.test();
    }
     public Animal(){

     }
     public Animal(int i){
        this.i = i;
     }
    static class Dog{
        public String dogName = "Grover";
        public void test(){

        }
     }

}
