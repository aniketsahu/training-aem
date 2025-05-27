package org.example.animal;

public class Lion extends Animal{
    public void updateSound(){
        sounds = "roar";
    }
    public void sound() {
        System.out.println("My sound is " + sounds);
    }
    public Lion(){
        super(3);
        System.out.println("what is i here " + i);
    }

    public static void main(String[] args) {
        Lion lion = new Lion();

    }
}
