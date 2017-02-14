package ua.itea.javabasic.practice.lesson16.interrupt;
import java.util.Scanner;
public class InterruptFirst extends Thread {
    public void run() {
        InterruptSecond[] threadArray = new InterruptSecond[10];
        for (int i = 0; i < 10; i++) {
            threadArray[i] = new InterruptSecond();
            threadArray[i].start();
        }

        Scanner scanner = new Scanner(System.in);
        String string;
        while(true) {
            string = scanner.nextLine();
            if(string.equalsIgnoreCase("exit")) {
                for (int i = 0; i < 10; i++) {
                    threadArray[i].interrupt();
                }
                break;
            }
        }
    }
}
