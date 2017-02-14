//D
package ua.itea.javabasic.practice.lesson03.intsqrt;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter variable f (float type): ");
        String sf = reader.readLine();
        float f = Float.parseFloat(sf);
        System.out.println("Result is (f^2): " + (f*f) + " ;");
    }
}
