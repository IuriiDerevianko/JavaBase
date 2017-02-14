package ua.itea.javabasic.practice.lesson08.cw01;
public class Point {
    private int x;
    private int y;
    private int z;

    public Point(int x, int y, int z) {
        this.x = x;
        this.x = y;
        this.x = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public  int distanceTo(Point another) {
        return (int)Math.sqrt(Math.pow(another.x - x, 2) + Math.pow(another.y - y,2) +
                Math.pow(another.z - z,2));
    }
}
