//D
package ua.itea.javabasic.practice.lesson04.cw_if;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        if(args.length==0) {
            System.out.println("Please enter two number (double type):");
            String sd1 = reader.readLine();
            double d1 = Double.parseDouble(sd1);
            String sd2 = reader.readLine();
            double d2 = Double.parseDouble(sd2);
            double d3 = d1 * d2;
            System.out.println("Result is (d1*d2): " + d3 + " ;");
        }
        else {
            if(args.length==1) {
                double d1 = Double.parseDouble(args[0]);
                if (d1>=0) {
                    double d2 = Math.sqrt(d1);
                    System.out.println("Result is (sqrt(d1)): " + d2 + " ;");
                }
                else {
                    double d2 = Math.sqrt(d1*(-1));
                    System.out.println("Result is (sqrt(|d1|)): " + d2 + " ;");
                }
            }
            else {
                double d1 = Double.parseDouble(args[0]);
                double d2 = Double.parseDouble(args[1]);
                double d3 = d1*d2;
                System.out.println("Result is (d1*d2): " + d3 + " ;");
            }
        }
    }
}
