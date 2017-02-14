package ua.itea.javabasic.practice.lesson09.figures;
class Shape {
    private String color;
    private double area;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void print() {
        System.out.println(color + " shape");
    }

    public double getArea() {
        return area;
    }

    public void build() {
    }
}
