package ua.itea.javabasic.practice.lesson13.cw02;
import java.util.Scanner;
public class Rectangle {
    private static PointInitializer.Point begin;
    private static PointInitializer.Point end;

    public static int getBegin() {
        return begin.i;
    }

    public static int getEnd() {
        return end.i;
    }

    static class PointInitializer {

        //                        x  y
        //exemple: coordinates = "12:345"
        static void parse(String coordinates) {
            Scanner sc = new Scanner(coordinates);
            sc.useDelimiter(":");
            begin = new Point(sc.nextInt());
            end = new Point(sc.nextInt());
        }

        static class Point {
            public int i;

            public Point(int i) {
                this.i = i;
            }
        }
    }
}
