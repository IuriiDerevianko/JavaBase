package ua.itea.javabasic.practice.lesson06.points_app_with_class_three_d;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Point s1 = new Point();
        Point s2 = new Point();
        s1.x = scanner.nextInt();
        s1.y = scanner.nextInt();
        s1.z = scanner.nextInt();
        s2.x = scanner.nextInt();
        s2.y = scanner.nextInt();
        s2.z = scanner.nextInt();

        int dist = distance(s1, s2);
        System.out.println("Distance = " + dist);
    }

    static int distance(Point first, Point second) {
        return (int) (Math.sqrt (Math.pow(second.x - first.x, 2))+(Math.pow(second.y - first.y, 2))
                    +(Math.pow(second.z - first.z, 2)));
    }
}
