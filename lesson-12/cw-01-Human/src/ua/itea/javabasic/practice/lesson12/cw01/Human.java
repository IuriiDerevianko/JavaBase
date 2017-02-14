package ua.itea.javabasic.practice.lesson12.cw01;
public class Human implements Comparable<Human> {
    public int age;

    public Human(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Human h) {
        return h.getAge() - age;
    }

    /*@Override
    public int compareTo(Human h) {

        if (this.age > h.getAge()) {
            return 1;
        }
        if (this.age < h.getAge()) {
            return -1;
        }
        return 0;
    }*/
}
