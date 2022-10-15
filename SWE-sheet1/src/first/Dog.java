package first;

import java.awt.*;
import java.util.Date;

public class Dog extends Animal{
    public Color hairColor;
    public DogOwner owner;

    public Dog(String name, Date birthday, Color hairColor, DogOwner owner) {
        super(name, birthday);
        this.hairColor = hairColor;
        this.owner = owner;
    }

    public void chewToy(){
        System.out.println("Chewing Toy");
    }
    public void bark(){
        System.out.println("Woof Woof");
    }
}
