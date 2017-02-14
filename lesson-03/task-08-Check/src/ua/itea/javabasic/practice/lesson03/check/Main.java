//D
package ua.itea.javabasic.practice.lesson03.check;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader((System.in)));
        System.out.println("Please enter x (double type): ");
        String sx = reader.readLine();
        System.out.println("Please enter y (double type): ");
        String sy = reader.readLine();
        double x = Double.parseDouble(sx);
        double y = Double.parseDouble(sy);

        //a)
        System.out.println("\ta) (x^3 - y^2) <= 0 : " + (((x*x*x) - (y*y)) <= 0 ) + " ;");

        //b)
        System.out.println("\tb) (!((x*y)<1))&&(y>x) : " + ((!((x*y)<1))&&(y>x)) + " ;");
    }
}
