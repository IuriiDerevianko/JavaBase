package ua.itea.javabasic.practice.lesson11.figureslsp;
import  static java.lang.Math.PI;
class Circle extends Shape {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public void print() {
        System.out.println(getColor()+ " circle with radius: " + radius + " px;");
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return PI*(Math.pow(radius, 2));
    }

    @Override
    public void build() {
        double y1, y2;
        for (int i = 1; i <= 2*radius; i++)
        {
            for (int j = 1; j <= 2*radius; j++)
            {
                y1 = radius + Math.sqrt(radius*radius-Math.pow(radius-j, 2));
                y2 = radius - Math.sqrt(radius*radius-Math.pow(radius-j, 2));
                if ((i > y2) && (i < y1)) {
                    System.out.print(" *");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
