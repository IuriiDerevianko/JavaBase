//D
package ua.itea.javabasic.practice.lesson04.palindrome;
public class Main {
    public static void main(String[] args) {
        String number = "2332";
        System.out.println("You entered number: " + number + ";");
        char[] charArrayNumber = number.toCharArray();
        if((charArrayNumber[0] == charArrayNumber[3])&&(charArrayNumber[1] == charArrayNumber[2])) {
            System.out.println("This number is palindrome;");
        }
        else {
            System.out.println("This number isn't palindrome;");
        }
    }
}
