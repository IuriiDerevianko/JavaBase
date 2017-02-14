//D
package ua.itea.javabasic.practice.lesson13.bitwise;
import java.util.Scanner;
public class Main {

    public static int setBit(int number, int pos){
        int posVariable = (int)(Math.pow(2, pos));
        int result = number|posVariable;
        return result;
    }

    public static int unsetBit(int number, int pos){
        int posVariable = (int)(Math.pow(2, pos));
        int result = number^posVariable;
        return result;
    }

    public static boolean isBitSet(int number, int pos){
        int posVariable = (int)(Math.pow(2, pos));
        return ((number/posVariable) >= 1);
    }

    public static void main(String[] args) {
        //1.
        System.out.println("1)");
        System.out.println("Result setBit is " + setBit(8, 0) + ";");
        System.out.println("Result unsetBit is " + unsetBit(9, 3) + ";");
        System.out.println("Result isBitSet is " + isBitSet(9, 4) + ";");
        System.out.println();

        //1.1
        System.out.println("1.1)");
        System.out.println("Please enter a number of 8-bit (from -128 to 127)binary form (0 or 1): ");
        System.out.println("2^7 2^6 2^5 2^4 2^3 2^2 2^1 2^0");
        System.out.println(" 7   6   5   4   3   2   1   0");
        System.out.println("<-----------------------------");

        Scanner scanner = new Scanner(System.in);
        int[] binaryNumber = new int [8];
        for (int i = (binaryNumber.length - 1); i >=0 ; i--) {
            binaryNumber[i] = scanner.nextInt();
        }

        System.out.println("You entered number of 8-bit binary form: ");
        System.out.print(" ");
        for (int i = 0; i < binaryNumber.length ; i++) {
            System.out.print(binaryNumber[i] + "   ");
        }
        System.out.println();

        int decimalNumber = 0;
        if(binaryNumber[0] == 1) {
            for (int i = 1; i < binaryNumber.length; i++) {
                if(binaryNumber[i] == 0) {
                    decimalNumber += (Math.pow(2, binaryNumber.length - 1 - i));
                }
            }
            System.out.println("You entered number of 8-bit decimal form:");
            System.out.println(- decimalNumber - 1);
            System.out.println("You entered number of 8-bit hexadecimal form:");
            System.out.printf("%X \n \n", (- decimalNumber - 1));
        }
        else {
            for (int i = 0; i < binaryNumber.length; i++) {
                decimalNumber += binaryNumber[i] * (Math.pow(2, binaryNumber.length - 1 - i));
            }
            System.out.println("You entered number of 8-bit decimal form:");
            System.out.println(decimalNumber);
            System.out.println("You entered number of 8-bit hexadecimal form:");
            System.out.printf("%X \n \n", decimalNumber);
        }

        //1.2
        System.out.println("1.2)");
        System.out.println("Please enter a natural number (from 1 to 2_147_483_647) in decimal form:");
        int naturalDecimalNumber = scanner.nextInt();
        System.out.println("You entered the natural number in binary form: ");
        System.out.println(Integer.toBinaryString(naturalDecimalNumber));
        char[] binaryCharArray = (Integer.toBinaryString(naturalDecimalNumber)).toCharArray();
        int counter = 0;
        for (char c : binaryCharArray) {
            if(c == '1') {
                counter++;
            }
        }
        System.out.println("Entered natural number in binary form has " + counter + " \"1\";");
        System.out.println();
    }
}
