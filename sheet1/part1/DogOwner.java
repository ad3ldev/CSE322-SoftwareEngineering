package part1;


import java.util.LinkedList;
public class DogOwner extends Person{
    public LinkedList<Dog> dogs = new LinkedList<Dog>();
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
