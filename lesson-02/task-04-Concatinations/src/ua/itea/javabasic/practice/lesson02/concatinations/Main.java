//D
package ua.itea.javabasic.practice.lesson02.concatinations;
import java.io.*;
public class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("--------------------------------------------------------------");
        System.out.println("Home work 2;  Iurii Derevianko;  Nov 2, 2016;");
        System.out.println();

        System.out.println("\tPlease enter the three strings (string type):");
        String s21 = reader.readLine();
        String s22 = reader.readLine();
        String s23 = reader.readLine();
        System.out.println("\t2.1.Result is (s1+s3): "+s21+s23+";");
        System.out.println("\t2.2.Result is (s3+s2+s1): "+s23+s22+s21+";");
        System.out.println("\t2.3.Result is (s1+s2+s3): "+s21+s22+s23+";");
        System.out.println();

        System.out.println("--------------------------------------------------------------");
    }
}