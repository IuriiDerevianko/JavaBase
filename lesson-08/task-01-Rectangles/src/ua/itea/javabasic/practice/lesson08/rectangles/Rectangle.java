package ua.itea.javabasic.practice.lesson08.rectangles;
public class Rectangle {
    private int x;
    private int y;
    static  int counter;

    public Rectangle(){
        x = 10;
        y = 50;
        counter++;
    }

    public Rectangle(int x, int y){
        this.x = x;
        this.y = y;
        counter++;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int area() {
        return x*y;
    }

    public static Rectangle combine(Rectangle r1, Rectangle r2) {
        Rectangle rectangle = new Rectangle((r1.x +r2.x), (r1.y+r2.y));
        return rectangle;
    }
}
