//D
package ua.itea.javabasic.practice.lesson06.point;
public class Main {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point();
        p1.x = 0;
        p1.y = 0;
        p1.z = 0;
        p2.x = 5;
        p2.y = 5;
        p2.z = 1;
        System.out.println("p1 (start) = [" + p1.x + ", " + p1.y + ", " + p1.z + "];");
        System.out.println("p2 (start) = [" + p2.x + ", " + p2.y + ", " + p2.z + "];");
        p1.addToAbscissa(1);
        p1.ordinate(1);
        p1.applicate(1);
        p1.moveTo(2, 2, 2);
        System.out.printf("%s, %s%n", "distanceTo = ",  p1.distanceTo(p2));
        p1.moveTo(p2);
        System.out.println("p1 (end) = [" + p1.x + ", " + p1.y + ", " + p1.z + "];");
        System.out.println("p2 (end) = [" + p2.x + ", " + p2.y + ", " + p2.z + "];");
    }
}
