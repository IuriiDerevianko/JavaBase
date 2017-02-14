//D
package ua.itea.javabasic.practice.lesson04.reflectedarray;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter number (integer type from 0):");
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()) {
            int number = scanner.nextInt();
            int[] mainArray = new int[number];
            int iStartFirst = number/2;
            int iStartSecond = number/2;
            if((number%2) == 0) {
                iStartSecond--;
            }
            for (int i = 0; i <= ((number -1)/2) ; i++, iStartFirst++, iStartSecond--) {
                mainArray[iStartFirst] = i;
                mainArray[iStartSecond] = i;
            }
            System.out.println(Arrays.toString(mainArray));
        }
        else {
            System.out.println("Enter symbol isn't integer type;");
        }
    }
}
