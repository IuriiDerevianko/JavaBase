package ua.itea.javabasic.practice.lesson11.figureslsp;
abstract class Shape {
    protected String color;
    protected double area;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void print() {
        System.out.println(color + " shape");
    }

    public abstract double getArea();

    public abstract void build();

}
