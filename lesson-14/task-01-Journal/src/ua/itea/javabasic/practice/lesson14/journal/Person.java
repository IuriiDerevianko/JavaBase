package ua.itea.javabasic.practice.lesson14.journal;
import java.util.Date;

// POJO
class Person {
    private String name;
    private String surname;
    private Date birth;

    public Person(String name, String surname, Date birth) throws IllegalNameException {
        if(name.equals("")) {
            throw new IllegalNameException("Empty name;");
        }
        this.name = name;
        this.surname = surname;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}
