//D
package ua.itea.javabasic.practice.lesson16.timestamp;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Timestamp t = new Timestamp();
        t.start();
        Scanner scanner = new Scanner(System.in);
        String string;
        while(true) {
            string = scanner.nextLine();
            if(string.equalsIgnoreCase("exit")) {
                t.interrupt();
                break;
            }
        }
    }
}
