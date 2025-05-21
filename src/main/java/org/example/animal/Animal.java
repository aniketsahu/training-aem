package org.example.animal;

 public class Animal {
    public String type;
    protected String name;
    protected String sounds = "meow";

    public void sound(){
        System.out.println("My sound is " + sounds);
    }
}
