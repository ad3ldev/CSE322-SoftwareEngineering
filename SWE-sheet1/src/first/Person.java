package first;

import java.util.Date;

public class Person extends Animal {
    public String phoneNumber;
    public String job;

    public Person(String name, Date birthday, String phoneNumber, String job) {
        super(name, birthday);
        this.phoneNumber = phoneNumber;
        this.job = job;
    }

    public void goToWork(){
        System.out.println("Going to work");
    }
}
