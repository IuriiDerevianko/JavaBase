//D
package ua.itea.javabasic.practice.lesson09.journal;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    private static final Register reg = new Register();

    // initial database
    static {
        reg.add(new Person("Iurii", "Derevianko", new Date(translateYear(1991), translateDay(3), 23)));
        reg.add(new Person("James", "Gosling", new Date(translateYear(1955), translateDay(5), 19)));
        reg.add(new Person("Linus", "Torvalds", new Date(translateYear(1969), translateDay(11), 28)));
    }

    private static int translateYear(int year) {
        return year - 1900;
    }

    private static int translateDay(int day) {
        return day - 1;
    }

    private static String translateDate(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd");
        return format.format(date);
    }

    public static void main(String[] args) {
        Date birthdate;
        int n;

        n = reg.indexByName("Iurii");
        System.out.println("Index is: " + n + ";");
        if(n != -1) {
            System.out.println(reg.get(n).getName() + " " + reg.get(n).getSurname() + ";");
            birthdate = reg.get(n).getBirth();
            System.out.println(translateDate(birthdate) + ";");
            System.out.println();
        }
        else {
            System.out.println("Isn't found;");
            System.out.println();
        }

        n = reg.indexBySurname("Gosling");
        System.out.println("Index is: " + n + ";");
        if(n != -1) {
            System.out.println(reg.get(n).getName() + " " + reg.get(n).getSurname() + ";");
            birthdate = reg.get(n).getBirth();
            System.out.println(translateDate(birthdate) + ";");
            System.out.println();
        }
        else {
            System.out.println("Isn't found;");
            System.out.println();
        }

        reg.delete(1);
        n = reg.indexBySurname("Gosling");
        System.out.println("Index is: " + n + ";");
        if(n != -1) {
            System.out.println(reg.get(n).getName() + " " + reg.get(n).getSurname() + ";");
            birthdate = reg.get(n).getBirth();
            System.out.println(translateDate(birthdate) + ";");
            System.out.println();
        }
        else {
            System.out.println("Isn't found;");
            System.out.println();
        }

        n = reg.indexByDate(new Date(translateYear(1969), translateDay(11), 28));
        System.out.println("Index is: " + n + ";");
        if(n != -1) {
            System.out.println(reg.get(n).getName() + " " + reg.get(n).getSurname() + ";");
            birthdate = reg.get(n).getBirth();
            System.out.println(translateDate(birthdate) + ";");
            System.out.println();
        }
        else {
            System.out.println("Isn't found;");
            System.out.println();
        }
    }
}



