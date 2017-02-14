//D
package ua.itea.javabasic.practice.lesson03.wws1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter string: ");
        String mainString = scanner.nextLine();
        String mainStringReplace = mainString.replace(' ', '\t');
        System.out.println("String size is: " + mainStringReplace.length() + " symbol(s);");
        System.out.println("Result is: " + mainStringReplace + ";");
        System.out.println("Please enter index K (from 0 to " + (mainStringReplace.length()-1) + "): ");
        int indexK = scanner.nextInt();
        char tempChar;
        char[] mainStringReplaceChar = mainStringReplace.toCharArray();
        tempChar = mainStringReplaceChar[indexK];
        mainStringReplaceChar[indexK] = mainStringReplaceChar[0];
        mainStringReplaceChar[0] = tempChar;
        String mainStringReplaceCharResult = new String(mainStringReplaceChar);
        System.out.println("Result is: " + mainStringReplaceCharResult + ";");
    }
}
