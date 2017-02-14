package ua.itea.javabasic.practice.lesson11.figureslsp;
class Rectangle extends Shape {
    private int a, b;

    public Rectangle(String color, int a, int b){
        super(color);
        this.a = a;
        this.b = b;
    }

    public void print() {
        System.out.println(getColor()+ " rectangle AxB: " + a + "x" + b + " px;");
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    @Override
    public double getArea() {
        return a*b;
    }

    @Override
    public void build() {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}