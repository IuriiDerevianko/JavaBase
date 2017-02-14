package ua.itea.javabasic.practice.lesson05.intsprinter;
public class Main {

    public static  void  printIntegers(String prefix, int from, int to) {
        int delta = 1;
        if (from > to) {
            delta = -delta;
        }
        for(int i = from; i != to + delta; i +=delta) {
            System.out.println(prefix +i);
        }
    }

    public static void main(String[] args) {
        printIntegers("day: ", 1, 7);
        System.out.println("Countdown before shuttle launch...");
        printIntegers("", 10, 0);
        System.out.println("Start!");
    }

}
