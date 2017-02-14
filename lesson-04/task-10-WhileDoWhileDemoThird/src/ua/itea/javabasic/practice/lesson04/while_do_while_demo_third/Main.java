//D
package ua.itea.javabasic.practice.lesson04.while_do_while_demo_third;
public class Main {
    public static void main(String[] args) {

        System.out.println("While:");
        int count = 2000;
        while (count != 0) {
            System.out.println("\tCount is: " + count +" ;");
            count-=2;
        }

        System.out.println("DoWhile:");
        count = 2000;
        do {
            System.out.println("\tCount is: " + count +" ;");
            count-=2;
        } while (count != 0);
    }
}
