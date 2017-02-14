//D
package ua.itea.javabasic.practice.lesson06.revinputwithclasses;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter the three numbers (integer type):");
        Scanner scanner = new Scanner(System.in);
        Variable variableFirst = new Variable(scanner.nextInt());
        Variable variableSecond = new Variable(scanner.nextInt());
        Variable variableThird = new Variable(scanner.nextInt());
        System.out.println("Result is: " + variableThird.number + "; " + variableSecond.number
                                           + "; " + variableFirst.number + ";");
    }
}
