package first;

import java.awt.*;
import java.util.Date;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("animal", new Date());
        Person person = new Person("person", new Date(), "+123456789", "job");
        DogOwner owner = new DogOwner("owner", new Date(), new LinkedList<Dog>(), "+123456789", "job");
        Dog dog = new Dog("dog", new Date(), new Color(255, 255, 255), owner);

//      1.a
        animal.eat();
        person.eat();
        owner.eat();
        dog.eat();

//      1.b
        System.out.println(person.phoneNumber);
        System.out.println(owner.phoneNumber);

//      1.c
        dog.chewToy();
        owner.dogs.getFirst().chewToy();

//      1.d
//      0 dogs or 1 dogs

//      1.e
//      All Classes
    }
}