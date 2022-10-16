package part1;
import java.util.Date;
public class Animal {
    public String name;
    public Date birthday;
    public void sleep(int hours){
        System.out.println("Slept for " + hours);
    }
    public void eat(){
        System.out.println("Eating");
    }
}
