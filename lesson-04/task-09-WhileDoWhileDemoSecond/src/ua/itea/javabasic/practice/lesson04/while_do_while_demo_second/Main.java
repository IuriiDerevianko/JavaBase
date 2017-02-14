//D
package ua.itea.javabasic.practice.lesson04.while_do_while_demo_second;
public class Main {
    public static void main(String[] args) {

        System.out.println("While:");
        int count = 10;
        while (count != 0) {
            System.out.println("\tCount is: " + count +" ;");
            count--;
        }

        System.out.println("DoWhile:");
        count = 10;
        do {
            System.out.println("\tCount is: " + count +" ;");
            count--;
        } while (count != 0);
    }
}
