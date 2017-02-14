package ua.itea.javabasic.practice.lesson06.points_app;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();

        System.out.println("Distance = " + distance(x1, y1, x2, y2));
    }
    static int distance(int x1, int y1, int x2, int y2) {
        return(int)Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2 - y1, 2));
    }
}
