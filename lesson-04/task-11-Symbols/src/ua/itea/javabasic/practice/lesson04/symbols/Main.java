//D
package ua.itea.javabasic.practice.lesson04.symbols;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%s%n" , "Please enter string: ");
        String string = scanner.nextLine();
        char[] charArray = string.toCharArray();
        int index = 0;
        while(index < charArray.length) {
            System.out.printf("%s%n", charArray[index]);
            index++;
        }
    }
}
