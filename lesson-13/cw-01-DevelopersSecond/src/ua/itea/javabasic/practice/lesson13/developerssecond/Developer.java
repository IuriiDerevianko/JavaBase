package ua.itea.javabasic.practice.lesson13.developerssecond;
public abstract class Developer extends Person {
    protected double basicSalary;
    protected int experience;

    public Developer(String name, double basicSalary, int experience) {
        super(name);
        this.basicSalary = basicSalary;
        this.experience = experience;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public abstract double getSalary();
}
