//D
package ua.itea.javabasic.practice.lesson16.person;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws Throwable {

        System.out.println(new PhoneNumber());
        System.out.println(new Person());
        new Person().finalize();

        Person ID = new Person("Iurii", 25, true, new Date((1991-1900), (3-1), 23), new PhoneNumber((short)38, 95, 895, 7760));
        System.out.println(ID);

        //plf/object/clone/
        //1.
        System.out.println(ID.clone());
        //2.
        System.out.println(new Person(ID));
        //3.
        System.out.println(ID.copy());

        //plf/object/equals/
        //1.
        System.out.println(ID.equals(ID));
        System.out.println(ID.clone().equals(ID.clone()));
        System.out.println(new Person(ID).equals(new Person(ID)));
        System.out.println(new Person(ID.clone()).equals(new Person(ID.clone())));
        System.out.println(ID.copy().equals(ID.copy()));

        //hashCode;
        System.out.println(ID.hashCode());
        System.out.println(ID.clone().hashCode());
        System.out.println(new Person(ID).hashCode());
        System.out.println(new Person(ID.clone()).hashCode());
        System.out.println(ID.copy().hashCode());
    }
}
