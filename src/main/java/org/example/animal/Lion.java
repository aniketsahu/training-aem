package org.example.animal;

public class Lion extends Animal{
    public void updateSound(){
        sounds = "roar";
    }
    public Lion (String name){
        //this.name = name;
        super(name);
    }
    public void sound() {
        System.out.println("My sound is " + sounds);
    }
}
