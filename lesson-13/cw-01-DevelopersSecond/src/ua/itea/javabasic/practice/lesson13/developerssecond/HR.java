package ua.itea.javabasic.practice.lesson13.developerssecond;
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

