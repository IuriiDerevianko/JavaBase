//D
package ua.itea.javabasic.practice.lesson04.max2;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter two numbers (double type) :");
        String sa = reader.readLine();
        double a = Double.parseDouble(sa);
        String sb = reader.readLine();
        double b = Double.parseDouble(sb);
        double max = a;
        if(max>b) {
            System.out.println("Max is first number: " + a + " ;");
        }
        else {
            max = b;
            System.out.println("Max is second number: " + b + " ;");
        }
    }
}
