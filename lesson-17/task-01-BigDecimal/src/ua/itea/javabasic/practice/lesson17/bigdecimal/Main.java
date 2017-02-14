//D
package ua.itea.javabasic.practice.lesson17.bigdecimal;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\tPlease enter the 1st number (BigDecimal type):");
        BigDecimal first = scanner.nextBigDecimal();
        System.out.println("\tPlease enter the 2nd number (BigDecimal type):");
        BigDecimal second = scanner.nextBigDecimal();
        System.out.println("\t3.1.Result is (d1+d2): " + (first.add(second)) + ";");
        System.out.println("\t3.2.Result is (d1-d2): " + (first.subtract(second, MathContext.DECIMAL32)) + ";");
        System.out.println("\t3.3.Result is (d1*d2): " + (first.multiply(second, MathContext.DECIMAL64)) + ";");
        System.out.println("\t3.4.Result is (d1/d2): " + (first.divide(second, new MathContext(100))) + ";");
    }
}