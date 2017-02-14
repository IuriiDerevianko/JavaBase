//D
package ua.itea.javabasic.practice.lesson09.figures;
public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
                new Rectangle("red", 10, 25),
                new Circle("black", 12),
                new Triangle("green", 22, 22, 22)};

        double area = 0;
        for(Shape shape : shapes) {
            shape.print();
            System.out.println("Area is: " + shape.getArea() + " px^2;");
            shape.build();
            System.out.println();
            area += shape.getArea();
        }
        System.out.println("Sum areas: " + area + " px^2;");
    }
}
