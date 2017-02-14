package ua.itea.javabasic.practice.lesson16.person;

import java.util.Date;
import java.util.Objects;

public class Person implements Cloneable {
    private String name;
    private int age;
    private boolean gender;
    private Date bith;
    private PhoneNumber number;


    public Person() {
    }

    public Person(String name, int age, boolean gender, Date bith, PhoneNumber number) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.bith = bith;
        this.number = number;
    }


    @Override
    public String toString() {
        return String.format("%s, %d, %b, %s, %s;", name, age, gender, bith, number);
    }


    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("Terminated...");
        } finally {
            super.finalize();
        }
    }

    //plf/object/clone/
    //1.
    @Override
    public Person clone() {
        Person copy = null;
        try {
            copy = (Person)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Does class implement Cloneable?");
        }
        return copy;
    }

    //2.
    public Person (Person other) {
        this.name = new String(other.name);
        this.age = other.age;
        this.gender = other.gender;
        this.bith = new Date(other.bith.getYear(), other.bith.getMonth(), other.bith.getDate() );
        this.number = new PhoneNumber(other.number);
    }

    //3.
    public Person copy () {
        return new Person(this);
    }

    //plf/object/equals/
    //1.
    @Override
    public boolean equals(Object another) {
        if (this == another) return true;
        if (another == null) return false;
        if (this.getClass() != another.getClass()) return false;
        Person p = (Person) another;
        return ((name.equals(p.name)) && (age == p.age) && (gender == p.gender)
                && (bith.getYear() == p.bith.getYear()) && (bith.getMonth() == p.bith.getMonth())
                && (bith.getDate() == p.bith.getDate()) && (number.getCountryCode() == p.number.getCountryCode())
                && (number.getAreaCode() == p.number.getAreaCode()) && (number.getLineNumber() == p.number.getLineNumber())
                && (number.getPrefix() == p.number.getPrefix()));
    }

    @Override
    public int hashCode() {
        //return (3 * age + 5 * name.hashCode() + 7 * bith.hashCode() + 9 *(gender?0:1) + 15 * number.hashCode());
        return Objects.hash(name, gender, age, bith, number);

    }
}
