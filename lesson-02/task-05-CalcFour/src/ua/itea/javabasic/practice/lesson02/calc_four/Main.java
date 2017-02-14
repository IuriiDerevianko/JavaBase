//D
package ua.itea.javabasic.practice.lesson02.calc_four;
import java.io.*;

public class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("--------------------------------------------------------------");
        System.out.println("Home work 2;  Iurii Derevianko;  Nov 2, 2016;");
        System.out.println();

        System.out.println("\tPlease enter the 1st number (float type):");
        String s31 = reader.readLine();
        float f31 = Float.parseFloat(s31);
        System.out.println("\tPlease enter the 2nd number (float type):");
        String s32 = reader.readLine();
        float f32 = Float.parseFloat(s32);
        System.out.println("\t3.1.Result is (f1+f2): "+(f31+f32)+";");
        System.out.println("\t3.2.Result is (f1-f2): "+(f31-f32)+";");
        System.out.println("\t3.3.Result is (f1*f2): "+(f31*f32)+";");
        System.out.println("\t3.4.Result is (f1/f2): "+(f31/f32)+";");

        System.out.println("--------------------------------------------------------------");
    }
}