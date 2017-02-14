package ua.itea.javabasic.practice.lesson08.circles;
import  static java.lang.Math.PI;
public class Circle {
    private double r;
    public static int counter;

    public Circle() {
        r=1;
        counter++;
    }

    public Circle(double r) {
        this.r = r;
        counter++;
    }

    public double getR() {
        return r;
    }

    public double area() {
        return PI*(Math.pow(r, 2));
    }

    public static Circle combine(Circle c1, Circle c2) {
        Circle circle = new Circle(c1.r + c2.r);
        return circle;
    }
}
