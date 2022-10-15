package first;

import java.util.Date;

public class Animal {
    public String name;
    public Date birthday;
    public Animal(String name, Date birthday){
        this.name = name;
        this.birthday = birthday;
    }
    public void sleep(int hours){
        System.out.println("Slept for " + hours);
    }
    public void eat(){
        System.out.println("Eating");
    }
}
