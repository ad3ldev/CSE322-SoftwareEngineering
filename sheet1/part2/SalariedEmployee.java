package part2;

public class SalariedEmployee extends Employee{
    public float weeklyPay;

    public void setWage(float wage){
        this.weeklyPay = wage;
    }
    public void moveOffice(Office office){
        System.out.println(office.number);
    }
}
