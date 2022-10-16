package part1;

import java.awt.*;
public class Dog extends Animal{
    public Color hairColor;
    public DogOwner owner;
    public void chewToy(){
        System.out.println("Chewing Toy");
    }
    public void bark(){
        System.out.println("Woof Woof");
    }
}
