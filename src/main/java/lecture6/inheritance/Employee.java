package lecture6.inheritance;

import lecture2.register.User;

public class Employee extends User {
    private String position;
    private double salary;

    public Employee(String name, int birthYear, String address, EyeColor eyeColor, String position, double salary) {
        super(name, birthYear, address, eyeColor);
        this.position = position;
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
