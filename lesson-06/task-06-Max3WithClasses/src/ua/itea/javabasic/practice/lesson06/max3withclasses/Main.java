//D
package ua.itea.javabasic.practice.lesson06.max3withclasses;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter three numbers (double type) :");
        Variable variableA = new Variable(scanner.nextDouble());
        Variable variableB = new Variable(scanner.nextDouble());
        Variable variableC = new Variable(scanner.nextDouble());
        Variable variableMax = variableA;


        if((variableMax.number > variableB.number) && (variableMax.number > variableC.number)) {
            System.out.println("Max is first number: " + variableMax.number + " ;");
        }
        else {
            variableMax = variableB;
            if(variableMax.number > variableC.number) {
                System.out.println("Max is second number: " + variableMax.number + " ;");
            }
            else {
                variableMax = variableC;
                System.out.println("Max is third number: " + variableMax.number + " ;");
            }
        }
    }
}
