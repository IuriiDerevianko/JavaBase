//D
package ua.itea.javabasic.practice.lesson04.day_of_week;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number day of week (integer type, from 1 to 7):");
        int numberDay = scanner.nextInt();
        if(numberDay == 1) {
            System.out.println("This day is Sunday;");
        }
        if(numberDay == 2) {
            System.out.println("This day is Monday;");
        }
        if(numberDay == 3) {
            System.out.println("This day is Tuesday;");
        }
        if(numberDay == 4) {
            System.out.println("This day is Wednesday;");
        }
        if(numberDay == 5) {
            System.out.println("This day is Thursday;");
        }
        if(numberDay == 6) {
            System.out.println("This day is Friday;");
        }
        if(numberDay == 7) {
            System.out.println("This day is Saturday;");
        }
    }
}
