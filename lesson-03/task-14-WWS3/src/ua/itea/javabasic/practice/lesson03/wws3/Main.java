//D
package ua.itea.javabasic.practice.lesson03.wws3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter string:");
        String mainString = scanner.nextLine();
        System.out.println("Please enter number of characters K (from 1 to " + mainString.length() + "):");
        int numberK = scanner.nextInt();
        String firstString = mainString.substring(0, numberK);
        String secondString = mainString.substring(numberK, mainString.length());
        String resultString = secondString + firstString;
        System.out.println("Result is:");
        System.out.println(resultString);
    }
}
