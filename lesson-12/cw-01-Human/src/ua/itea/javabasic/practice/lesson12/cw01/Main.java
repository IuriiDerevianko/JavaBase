package ua.itea.javabasic.practice.lesson12.cw01;
public class Main {
    public static void main(String[] args) {
        Human[] list = {
                new Human(40), new Human(20), new Human(3), new Human(7)
        };

        java.util.Arrays.sort(list);

        for(Human h : list) {
            System.out.println(h.getAge());
        }
    }
}

