//D
package ua.itea.javabasic.practice.lesson06.calcfourwithclasses;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the 1st number (double type):");
        Number firstNumber = new Number(scanner.nextDouble());
        System.out.println("Please enter the 2nd number (double type):");
        Number secondNumber = new Number(scanner.nextDouble());

        System.out.println("\t1. Result is (d1+d2): " + (firstNumber.variable + secondNumber.variable) + ";");
        System.out.println("\t2. Result is (d1-d2): " + (firstNumber.variable - secondNumber.variable) + ";");
        System.out.println("\t3. Result is (d1*d2): " + (firstNumber.variable * secondNumber.variable) + ";");
        System.out.println("\t4. Result is (d1/d2): " + (firstNumber.variable / secondNumber.variable) + ";");
    }
}
