//D
package ua.itea.javabasic.practice.lesson04.max3;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter three numbers (double type) :");
        String sa = reader.readLine();
        double a = Double.parseDouble(sa);
        String sb = reader.readLine();
        double b = Double.parseDouble(sb);
        String sc = reader.readLine();
        double c = Double.parseDouble(sc);
        double max = a;
        if((max>b)&&(max>c)) {
            System.out.println("Max is first number: " + a + " ;");
        }
        else {
            max = b;
            if(max>c) {
                System.out.println("Max is second number: " + b + " ;");
            }
            else {
                max = c;
                System.out.println("Max is third number: " + c + " ;");
            }
        }
    }
}
