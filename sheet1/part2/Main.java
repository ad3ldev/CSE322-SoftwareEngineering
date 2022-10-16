package part2;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Employee employee = new Employee();
        HourlyEmployee hourlyEmployee = new HourlyEmployee();
        SalariedEmployee salariedEmployee = new SalariedEmployee();
        Building building = new Building();
        Office office = new Office();

        //2.a
        // No office for hourly

        //2.b
        System.out.println(salariedEmployee.name);
        System.out.println(salariedEmployee.address);
        System.out.println(salariedEmployee.employeeID);
        System.out.println(salariedEmployee.weeklyPay);

        //2.c
        employee.fire();
        hourlyEmployee.fire();
        salariedEmployee.fire();

        //2.d
        System.out.println(person.address);
        System.out.println(person.name);

        //2.e
        // multiple offices in each building
    }
}
