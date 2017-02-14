//D
package ua.itea.javabasic.practice.lesson17.arraysperson;
import java.util.Date;
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private boolean gender;
    private Date birth;
    private Temperament temperament;
    private PhoneNumber number;


    public Person() {
    }

    public Person(String firstName, String lastName, int age, boolean gender, Date birth, Temperament temperament, PhoneNumber number) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.birth = birth;
        this.temperament = temperament;
        this.number = number;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %d, %b, %s, %s, %s\n", firstName, lastName, age, gender, birth, temperament, number);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isGender() {
        return gender;
    }

    public Temperament getTemperament() {
        return temperament;
    }
}