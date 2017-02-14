//D
package ua.itea.javabasic.practice.lesson17.arraysperson;
import java.util.Arrays;
import java.util.Date;
public class Main {
    public static void main(String[] args) {
        Person[] personArray = {
                new Person("Iurii", "Derevianko", 25, true, new Date((1991-1900), (3-1), 23), Temperament.SANGUINE, new PhoneNumber((short)38, 95, 895, 7760)),
                new Person("Iurii", "Derevianko", 24, true, new Date((1991-1900), (3-1), 23), Temperament.SANGUINE, new PhoneNumber((short)38, 95, 895, 7760)),
                new Person("Aurii", "Derevianko", 24, true, new Date((1991-1900), (3-1), 23), Temperament.SANGUINE, new PhoneNumber((short)38, 95, 895, 7760)),
                new Person("Aurii", "Arevianko", 24, true, new Date((1991-1900), (3-1), 23), Temperament.SANGUINE, new PhoneNumber((short)38, 95, 895, 7760)),
                new Person("Iurii", "Arevianko", 24, true, new Date((1991-1900), (3-1), 23), Temperament.SANGUINE, new PhoneNumber((short)38, 95, 895, 7760)),
                new Person("firstName", "lastName", 25, false, new Date((1991-1900), (1-1), 1), Temperament.PHLEGMATIC, new PhoneNumber((short)38, 50, 123, 4567)),
                new Person("firstName", "lastName", 24, true, new Date((1991-1900), (1-1), 2), Temperament.SUPINE, new PhoneNumber((short)38, 67, 123, 4567)),
                new Person("firstName", "lastName", 25, false, new Date((1991-1900), (1-1), 3), Temperament.CHOLERIC, new PhoneNumber((short)38, 93, 123, 4567)),
                new Person("firstName", "lastName", 25, true, new Date((1991-1900), (1-1), 4), Temperament.MELANCHOLIC, new PhoneNumber((short)38, 44, 123, 4567))
        };
        System.out.println(Arrays.toString(personArray));
        System.out.println();

        Arrays.sort(personArray, new PersonComparator());
        System.out.println(Arrays.toString(personArray));
    }
}
