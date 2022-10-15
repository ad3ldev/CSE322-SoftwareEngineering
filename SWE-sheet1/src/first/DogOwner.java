package first;

import java.util.Date;
import java.util.LinkedList;

public class DogOwner extends Person{
    public LinkedList<Dog> dogs;

    public DogOwner(String name, Date birthday, LinkedList<Dog> dogs, String phoneNumber, String job) {
        super(name, birthday, phoneNumber, job);
        this.dogs = dogs;
    }

    public void takeDogToVet(Dog d){
        System.out.println("first.Dog of owner " + d.owner + " to vet");
        dogs.getFirst().chewToy();
    }
    public void feedDog(Dog d){
        System.out.println("first.Dog of owner " + d.owner + " eating");
    }
    public void exerciseDog(Dog d){
        System.out.println("first.Dog of owner " + d.owner + " exercising");
    }
}
