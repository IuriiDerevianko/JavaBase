//D
package ua.itea.javabasic.practice.lesson03.like;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter X:");
        String x = scanner.nextLine();
        System.out.println("Please enter Y:");
        String y = scanner.nextLine();
        String result = "I like " + x + " because of " + y + ";";
        System.out.println(result);
    }
}
