package ua.itea.javabasic.practice.lesson11.developers;
public abstract class HR extends Person {
    protected double salary;

    public HR(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
