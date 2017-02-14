package ua.itea.javabasic.practice.lesson09.figures;
class Rectangle extends Shape {
    private int a, b;
    private String color;

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

    public double getArea() {
        return a*b;
    }

    public void build() {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}
