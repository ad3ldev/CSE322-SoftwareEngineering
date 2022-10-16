package part1;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Person person = new Person();
        DogOwner owner = new DogOwner();
        Dog dog = new Dog();

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