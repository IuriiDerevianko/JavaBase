//D
package ua.itea.javabasic.practice.lesson08.cw01;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int z1 = scanner.nextInt();

        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int z2 = scanner.nextInt();

        Point p1 = new Point(x1, y1, z1);
        Point p2 = new Point(x2, y2, z2);

        System.out.println("Distance = " + p1.distanceTo(p2));
    }
}
