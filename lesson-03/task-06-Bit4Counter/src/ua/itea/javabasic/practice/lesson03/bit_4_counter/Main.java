//D
package ua.itea.javabasic.practice.lesson03.bit_4_counter;
import java.io.*;
public class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter number from 1 to 15 (integer type):");
        String s = reader.readLine();
        int i = Integer.parseInt(s);
        int res1 = i/8;
        int temp1 = i%8;
        int res2 = temp1/4;
        int temp2 = temp1%4;
        int res3 = temp2/2;
        int temp3 = temp2%2;
        int res4 = temp3/1;
        System.out.println("Result is: " + (res1 + res2 + res3 + res4) + " ;");
    }
}
