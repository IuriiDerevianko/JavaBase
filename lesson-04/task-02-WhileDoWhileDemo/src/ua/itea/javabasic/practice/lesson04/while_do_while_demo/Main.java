//D
package ua.itea.javabasic.practice.lesson04.while_do_while_demo;
public class Main {
    public static void main(String[] args) {

        System.out.println("While:");
        int count = 1;
        while (count < 11) {
            System.out.println("\tCount is: " + count +" ;");
            count++;
        }

        System.out.println("DoWhile:");
        count = 1;
        do {
            System.out.println("\tCount is: " + count +" ;");
            count++;
        } while (count < 11);
    }
}
