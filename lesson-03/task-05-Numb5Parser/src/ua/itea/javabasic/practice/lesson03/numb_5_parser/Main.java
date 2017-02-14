//D
package ua.itea.javabasic.practice.lesson03.numb_5_parser;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Please enter a five-digit number (integer type): ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String st = reader.readLine();
        int i = Integer.parseInt(st);
        int res1 = i/10000;
        int temp1 = i%10000;
        int res2 = temp1/1000;
        int temp2 = temp1%1000;
        int res3 = temp2/100;
        int temp3 = temp2%100;
        int res4 = temp3/10;
        int res5 = temp3%10;
        System.out.print("Result is: " + res1 + " " + res2 + " " + res3 + " " + res4 + " " + res5 + ";");
    }
}
