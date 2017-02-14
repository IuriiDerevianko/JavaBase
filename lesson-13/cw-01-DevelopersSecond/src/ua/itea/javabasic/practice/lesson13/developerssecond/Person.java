package ua.itea.javabasic.practice.lesson13.developerssecond;
import java.util.Date;

public abstract class Person {
    protected String name;
    protected boolean gender;
    protected int age;
    protected Date bithday;
    protected String phoneNumber;

    public Person(String name, boolean gender, int age, Date birthday, String phoneNumber) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.bithday = birthday;
        this.phoneNumber = phoneNumber;
    }

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

