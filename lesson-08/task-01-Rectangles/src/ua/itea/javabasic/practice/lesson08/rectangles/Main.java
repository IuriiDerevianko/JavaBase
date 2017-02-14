//D
package ua.itea.javabasic.practice.lesson08.rectangles;
public class Main {
    public static void main(String[] args) {
        Rectangle rectangleFirst = new Rectangle();
        Rectangle rectangleSecond = new Rectangle(20, 100);

        System.out.println("1)Result (r1) rectangleFirst.area() is:  " + rectangleFirst.area() + ";");
        System.out.println("\tX = " + rectangleFirst.getX() + ";");
        System.out.println("\tY = " + rectangleFirst.getY() + ";");
        System.out.println("2)Result (r2) rectangleSecond.area() is:  " + rectangleSecond.area() + ";");
        System.out.println("\tX = " + rectangleSecond.getX() + ";");
        System.out.println("\tY = " + rectangleSecond.getY() + ";");
        Rectangle rectangleThird = Rectangle.combine(rectangleFirst, rectangleSecond);
        System.out.println("3)Result (r1+r2) rectangleThird.area() is:  " + rectangleThird.area() + ";");
        System.out.println("\tX = " + rectangleThird.getX() + ";");
        System.out.println("\tY = " + rectangleThird.getY() + ";");
        System.out.println("Counter = " + Rectangle.counter + ";");
    }
}
