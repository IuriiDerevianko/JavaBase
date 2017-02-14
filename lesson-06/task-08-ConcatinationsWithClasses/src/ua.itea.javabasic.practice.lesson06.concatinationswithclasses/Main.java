//D
package ua.itea.javabasic.practice.lesson06.concatinationswithclasses;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //a)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the three strings (string type):");
        StringVariable firstString = new StringVariable();
        firstString.variable = scanner.nextLine();
        StringVariable secondString = new StringVariable();
        secondString.variable = scanner.nextLine();
        StringVariable thirdString = new StringVariable();
        thirdString.variable = scanner.nextLine();
        //b)
        System.out.println("\t1. Result is (s1+s3): " + firstString.variable
                                                      + thirdString.variable + ";");
        System.out.println("\t2. Result is (s3+s2+s1): " + thirdString.variable
                                 + secondString.variable + firstString.variable + ";");
        System.out.println("\t3. Result is (s1+s2+s3): " + firstString.variable
                                 + secondString.variable + thirdString.variable + ";");
    }
}
