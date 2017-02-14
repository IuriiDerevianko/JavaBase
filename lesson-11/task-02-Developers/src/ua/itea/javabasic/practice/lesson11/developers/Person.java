package ua.itea.javabasic.practice.lesson11.developers;
public abstract class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
