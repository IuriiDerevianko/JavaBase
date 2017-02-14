//D
package ua.itea.javabasic.practice.lesson04.symbols_second;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%s%n" , "Please enter string: ");
        String string = scanner.nextLine();
        char[] charArray = string.toCharArray();
        System.out.printf("%s%n" , "Please choose a/o/e : ");
        String choose = scanner.nextLine();
        char charChoose = choose.charAt(0);
        if(charChoose == 'a') {
            int index = 0;
            while(index < charArray.length) {
                System.out.printf("%s%n", charArray[index]);
                index++;
            }
        }
        if(charChoose == 'o') {
            int index = 1;
            while(index < charArray.length) {
                System.out.printf("%s%n", charArray[index]);
                index+=2;
            }
        }
        if(charChoose == 'e') {
            int index = 0;
            while(index < charArray.length) {
                System.out.printf("%s%n", charArray[index]);
                index+=2;
            }
        }

    }
}
