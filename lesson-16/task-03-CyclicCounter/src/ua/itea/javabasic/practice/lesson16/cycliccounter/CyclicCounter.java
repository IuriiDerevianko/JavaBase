package ua.itea.javabasic.practice.lesson16.cycliccounter;
import java.util.Scanner;
public class CyclicCounter extends Thread {
    public void run() {

        int number;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter value \"From\":");
        int from = scanner.nextInt();

        System.out.println("Please enter value \"To\":");
        int to = scanner.nextInt();

        System.out.println("Please enter value \"Step\":");
        int step = scanner.nextInt();

        System.out.println("Please enter value \"Delay\":");
        int delay = scanner.nextInt();

        while(!isInterrupted()) {
            number = (from - step);
            if((step <= 0) && (to < from)) {
                while ((number + step) >= to) {
                    try {
                        System.out.print((number += step) + " ");
                        Thread.sleep(delay);
                    } catch (InterruptedException e) {
                        System.out.println();
                        System.out.println("sleep() interrupted!");
                        return;
                    }
                }
                System.out.println();
            } else {
                if ((step >= 0) && (to > from)) {
                    while ((number + step) <= to) {
                        try {
                            System.out.print((number += step) + " ");
                            Thread.sleep(delay);
                        } catch (InterruptedException e) {
                            System.out.println();
                            System.out.println("sleep() interrupted!");
                            return;
                        }
                    }
                    System.out.println();
                } else {
                    if((step == 0) && (to == from)) {
                        try {
                            System.out.print(number + " ");
                            Thread.sleep(delay);
                        } catch (InterruptedException e) {
                            System.out.println();
                            System.out.println("sleep() interrupted!");
                            return;
                        }
                        System.out.println();
                    } else {
                        System.out.println("You entered incorrect values;");
                        break;
                    }
                }
            }
        }
        System.out.println("isInterrupted() : false");
    }
}
