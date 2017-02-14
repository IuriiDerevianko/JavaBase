//D
package ua.itea.javabasic.practice.lesson05.diagprint;
import java.io.*;
public class Main {

    public static void charArray(String inString) {
        char[] inChar = inString.toCharArray();
        char[][] outChar = new char[inChar.length][inChar.length];
        for (int i = 0; i < inChar.length; i++) {
            outChar[i][i] = inChar[i];
        }
        System.out.println("Result is:");
        for (int i = 0; i < inChar.length; i++) {
            for (int j = 0; j < inChar.length; j++) {
                System.out.print("  " + outChar[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter string:");
        String mainString = reader.readLine();
        charArray(mainString);
    }
}
