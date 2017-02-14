//D
package ua.itea.javabasic.practice.lesson02.rev_input;
import java.io.*;
public class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("--------------------------------------------------------------");
        System.out.println("Home work 2;  Iurii Derevianko;  Nov 2, 2016;");
        System.out.println();

        System.out.println("\tPlease enter the three numbers (integer type):");
        String s11 = reader.readLine();
        int i11 = Integer.parseInt(s11);
        String s12 = reader.readLine();
        int i12 = Integer.parseInt(s12);
        String s13 = reader.readLine();
        int i13 = Integer.parseInt(s13);
        System.out.println("\tResult is: "+i13+"; "+i12+"; "+i11+";");
        System.out.println();

        System.out.println("--------------------------------------------------------------");
    }
}
