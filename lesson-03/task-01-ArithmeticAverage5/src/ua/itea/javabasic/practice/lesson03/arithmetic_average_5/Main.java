//D
package ua.itea.javabasic.practice.lesson03.arithmetic_average_5;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the five-element array (float type (from -3 to 10^12)): ");
        float[] f = new float[5];
        String sf0 = reader.readLine();
        f[0] = Float.parseFloat(sf0);
        String sf1 = reader.readLine();
        f[1] = Float.parseFloat(sf1);
        String sf2 = reader.readLine();
        f[2] = Float.parseFloat(sf2);
        String sf3 = reader.readLine();
        f[3] = Float.parseFloat(sf3);
        String sf4 = reader.readLine();
        f[4] = Float.parseFloat(sf4);
        float arithmeticAverage = ((f[0] + f[1] + f[2] + f[3] + f[4]) / f.length);
        System.out.println("Arithmetic average is: " + arithmeticAverage + " ;");
    }
}
