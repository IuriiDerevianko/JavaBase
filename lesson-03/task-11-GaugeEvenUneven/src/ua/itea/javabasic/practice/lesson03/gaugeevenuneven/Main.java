//D
package ua.itea.javabasic.practice.lesson03.gaugeevenuneven;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter string: ");
        String mainString = scanner.nextLine();
        System.out.println("String size is: " + mainString.length() + " symbol(s);");
        char[] charArray = mainString.toCharArray();
        char charTemp = charArray[0];
        charArray[0] = charArray[charArray.length-1];
        charArray[charArray.length-1] = charTemp;
        String mainStringResult = new String(charArray);
        System.out.println("Result is: " + mainStringResult + ";");
        if((charArray.length % 2) == 0) {
            System.out.println("true;");
        }
        else {
            System.out.println("false;");
        }
    }
}
